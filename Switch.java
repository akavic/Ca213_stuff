/**
 * Created by bobby_000 on 09/03/2018.
 */
//a class should only be concerend with one thing
//should jsut be concerend with turning on and off
    //clases should be myopic...
public class Switch  {


    void turnonState(Switchable thing){
        thing.turnOn();

    }

    void turnoffState(Switchable thing){
        thing.turnOff();
    }

}
