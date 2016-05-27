package ca.thundersun.myapplication;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ValidNumberWatcher implements TextWatcher {
    EditText editText;
    MyViewModel myViewModel;
    int propId;

    public ValidNumberWatcher(EditText e) {
        editText = e;
    }
    public ValidNumberWatcher(EditText e, MyViewModel m, int property_id) {
        editText = e;
        myViewModel = m;
        propId = property_id;
    }

    @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
    @Override public void onTextChanged(CharSequence s, int start, int before, int count) { }
    @Override public void afterTextChanged(Editable s) {
        try {
            parseTextAndHighlight();
        } catch( NumberFormatException e) {
        }
        //if( myViewModel != null) myViewModel.notifyPropertyChanged(propId);
    }

    public float parseTextAndHighlight() {
        float calcBucks = 0f;
        try {
            String str = editText.getText().toString();
            calcBucks = Float.parseFloat(str);
        } catch( NumberFormatException e) {
            editText.setBackgroundColor(Color.RED);
            throw(e);
        }
        editText.setBackgroundResource(android.R.drawable.edit_text);
        return calcBucks;
    }
}
