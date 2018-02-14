/**
 * Created by bobby_000 on 09/02/2018.
 */
//ex.3
public class Time {
//(a)
    private int tval; // instance variable to store the time

    void get()
    {
        tval=Console.readInt();
    }

    boolean gt(Time time)
    {
        // how this works if tval=3 >time.tval=5 method returns false and if tval=6 >time.tval=5 method returns true save you having to write if statements
        //to return true or false according to whether the time as represented by the instance variables is greater than another time supplied as a parameter
        return tval>time.tval;
        // this method is essential, cause it allows you to compare two times without having to call the tval in the period clas which you can't cause it's private this method allows you acces to tval
    }
}
//(b)
