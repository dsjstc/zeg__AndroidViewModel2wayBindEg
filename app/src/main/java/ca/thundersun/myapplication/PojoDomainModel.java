package ca.thundersun.myapplication;

/**
 * Created by at on 26/05/16.
 */
public class PojoDomainModel {

    private String domainString = "domain";
    private boolean domainChecked = true;
    private float domainBucks = 1.23f;

    public String getDomainString() {
        return domainString;
    }
    public void setDomainString(String domainString) {
        this.domainString = domainString;
    }

    public boolean isDomainChecked() {
        return domainChecked;
    }
    public void setDomainChecked(boolean domainChecked) {
        this.domainChecked = domainChecked;
    }
    public float getDomainBucks() {
        return domainBucks;
    }
    public void setDomainBucks(float domainBucks) {
        this.domainBucks = domainBucks;
    }
}
