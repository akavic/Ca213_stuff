/**
 * Created by bobby_000 on 09/03/2018.
 */
public abstract  class Device  {

    //implements PersonalDetails.Nameisset  if an bastract class implements an interface it doesn't have to impmnet it's method but it's children have to

    private String devicename;
    private boolean isOn;

    abstract void breakDevice();

    public void setname(String devicename){
        this.devicename=devicename;
    }

    String returnname(){
        return devicename;
    }
    public boolean isOn( ){
        return isOn;
    }
    public void setOn(boolean isOn){
        this.isOn=isOn;
    }

}
