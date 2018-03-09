/**
 * Created by bobby_000 on 09/03/2018.
 */
public class Light extends Device implements Switchable {

    Light(){
        setname("Hey I'm a light");
    }
    @Override
    String returnname() {
        return super.returnname();
    }
    @Override
    void breakDevice() {
        System.out.print(returnname()+" Light is broken \n");

    }

    public void turnOn(){
        System.out.print("WHoo Fan is on \n");
    }
    public void turnOff(){
        System.out.print("WHoo Fan is off \n");
    }
}
