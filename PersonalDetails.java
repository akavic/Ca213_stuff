/**
 * Created by bobby_000 on 08/03/2018.
 */
public class PersonalDetails {

    private String name;
    private String lname;
    private Nameisset nameisset;

    interface Nameisset{
         void setname(String name, String lname);

    }

    void set(){
        nameisset.setname("victor","akinla");
    }

}
class PrintDetails implements PersonalDetails.Nameisset{

    PersonalDetails p;


    @Override
    public void setname(String name, String lname) {

        p.set();
    }

}
