package ca.thundersun.myapplication;

import android.view.View;

public class MyHandlers {
    MyViewModel myViewModel;
    PojoDomainModel domain;
    public MyHandlers(MyViewModel m, PojoDomainModel d) {
        myViewModel = m;
        domain = d;
    }

    public void useBucks(View v) {
        float bucks;
        try {
            bucks = myViewModel.buckWatcher.parseTextAndHighlight();
        } catch( NumberFormatException e) {
            return;
        }
        domain.setDomainBucks(bucks);
        myViewModel.notifyPropertyChanged(ca.thundersun.myapplication.BR.bucks);
    }
}
