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



