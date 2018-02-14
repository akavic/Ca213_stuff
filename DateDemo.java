/**
 * Created by bobby_000 on 08/02/2018.
 */
class Date {

    private int day, month, year; // the date

    // Constructors
    Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    Date()
    {
        day=0;
        month=0;
        year=0;
    }



    void get() {
        // Read a day, month, and year from the keyboard
        // (assumed a valid post-1900 date).
        day=Console.readInt();
        month=Console.readInt();
        year=Console.readInt();
    }

    void put() {
        // Write the date (as typified by 10/7/2002)
        System.out.print(day+"/"+month+"/"+year);
    }

    boolean postDates(Date d) {
        // Does this date occur on or after d?
        return true;
    }

    Date latestDate(Date obj)
    {
        //returns the latest date what occurs is the the default date is reset with the latest date anytime one appears

        if (obj.year==year&&obj.month==month&&obj.day==day) // if dates are the same day set the instance variable date as the latest date
        {
            day=obj.day;
            month=obj.month;
            year=obj.year;
            return obj;

        }
        else if(obj.year>year ) //year is greater than the other
        {
            day=obj.day;
            month=obj.month;
            year=obj.year;
            return obj;
        }
        else if(obj.year==year && obj.month>month ) //year is greater than the other
        {
            day=obj.day;
            month=obj.month;
            year=obj.year;
            return obj;
        }
        else if(obj.year==year && obj.month==month && obj.day>day) //year is == t0 the same year and month is equal then compare with month
        {
            day=obj.day;
            month=obj.month;
            year=obj.year;
            return obj;
        }
        return null;
    }

    private int elapsedDays() {
        // The number of days elapsed from 1/1/1900 to this date
        int days = (year-1900)*365+(year-1901)/4;
        int k = 1;
        while (k<month) {
            int daysInMonth;
            if (k==9||k==4||k==6||k==11)
                daysInMonth = 30;
            else if (k==2) {
                if (year%4==0 && year!=1900) daysInMonth = 29;
                else daysInMonth = 28;
            }
            else daysInMonth = 31;
            days = days + daysInMonth;
            k++;
        }
        return days + day;
    }
}


class DateDemo
{

    public static void main(String[] args) {

      /*  Date default_date =new Date();
        Date comparsion_date = new Date();
        while(!Console.EndOfFile()) {
            comparsion_date.get();
            default_date.latestDate(comparsion_date);
        }
        default_date.put();
        */
        /*Point p1=new Point();
        Point p2 = new Point();
        p1.get();
        p2.get();
        p1.midpoint(p2).midpoint_print();
        */

        /*Period p1=new Period();
        Period p2=new Period();
        p1.get();
        p2.get();

        if(p1.overlaps(p2))
            System.out.print("They overlaps");
        else
            System.out.print("doesn't overlap");

            */
       /* Rational r1 = new Rational(13,3);
        Rational r2 = new Rational(4,6);
        Rational r3 = new Rational(2,3);

        System.out.println(r1 + "+" + r2 + " = " + r1.add(r2));
        System.out.println(r1 + "-" + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + "*" + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + "==" + r3 + " = " + r2.equals(r3)); // todo may need to create own equal method
        System.out.println(r1 + " as double = " + r1.doubleValue());

        */

        Pair<String,Integer> phoneNumber =
                new Pair<>("Bill's number", 1324);
        System.out.println(phoneNumber);
        Pair<Double,Double> point =
                new Pair<>(3.14, 2.32);
        System.out.println(point);






    }
}

