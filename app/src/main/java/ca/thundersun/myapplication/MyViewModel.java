package ca.thundersun.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * The viewmodel's job is to interface to the domain model.
 *
 * Obviously, the domain model does not notify the view model of changes.
 * We *could* keep a cache copy of each variable here, and poll for changes,
 * but that seems inelegant.  Better to allow the domain controller to trigger
 * an invalidation here when necessary.
 */
public class MyViewModel extends BaseObservable {
    PojoDomainModel domain;

    public MyViewModel(PojoDomainModel d) {
        domain = d;
    }

    @Bindable
    public boolean getChecked() {
        return domain.isDomainChecked();
    }
    public void setChecked(boolean b) {
        domain.setDomainChecked(b);
        notifyPropertyChanged(ca.thundersun.myapplication.BR.checked);
    }

    @Bindable
    public String getStringVM() {
        return domain.getDomainString();
    }
    public void setStringVM(String s) {
        domain.setDomainString(s);
        notifyPropertyChanged(ca.thundersun.myapplication.BR.stringVM);
    }

    // Note that the float domain does not get updated in real time.
    // I couldn't figure out any way to do that without writing a custom
    // watcher class for each domain object that needs modification.
    @Bindable public float getBucks() {
        return domain.getDomainBucks();
    }
    public void setBucks(float b) {
        domain.setDomainBucks(b);
        notifyPropertyChanged(ca.thundersun.myapplication.BR.bucks);
    }
    public ValidNumberWatcher buckWatcher;
}

