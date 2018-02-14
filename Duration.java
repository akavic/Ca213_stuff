/**
 * Created by bobby_000 on 10/02/2018.
 */
public class Duration <T extends Comparable<T>> {
    //generic worksheet ex 3 i changed class naem date to duration so it wont clash with the other class
//Enhance the following Duration class to implement the Comparable interface

    private int day, month, year;

    Duration(int day0, int month0, int year0) {
        day = day0; month = month0; year = year0;
    }

    public String toString() {
        return "" + day + "/" + month + "/" + year;
    }

    private int elapsedDays() {
        // Number of days elapsed from 1/1/1900 to this date
        int days = (year-1900)*365+(year-1901)/4;
        int k = 1;
        while (k<month) {
            int daysInMonth;
            if (k==9||k==4||k==6||k==11)daysInMonth = 30;
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

