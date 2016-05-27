package ca.thundersun.myapplication;

import android.view.View;
import android.widget.EditText;

public class MyHandlers {
    MyViewModel myViewModel;
    public MyHandlers(MyViewModel m) {
        myViewModel = m;
    }

    public void bucksFocusChange(View v, boolean hasFocus) {
        if(!hasFocus)
        {
            EditText et = (EditText) v;
            //myViewModel.setBucks(et.getText().toString());
        }
    }
}
