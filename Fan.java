/**
 * Created by bobby_000 on 09/03/2018.
 */
public class Fan extends Device implements Switchable {

   Fan(){
       setname("Hey I'm a Fan");
   }

    @Override
    String returnname() {
        return super.returnname();
    }
    @Override
    void breakDevice() {
        System.out.print(returnname()+" Fan is broken \n");
    }
    public void turnOn(){
        System.out.print("WHoo Light is on \n");
    }
    public void turnOff(){
        System.out.print("WHoo Light is off \n");
    }
}
