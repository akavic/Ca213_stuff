import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by bobby_000 on 08/03/2018.
 */
public class Demo {

    public static void main(String[] args) {

        Fan fan = new Fan();
        Light light =new Light();
         Switch mswitch =new Switch();

        mswitch.turnonState(fan);
        mswitch.turnoffState(fan);

       int [] arr={9,8,7,6,5,4,3,2,1};

        System.out.print(Arrays.toString(arr));


    }

    public static void quickSort(int[] arr, int low, int high) {
        //https://www.programcreek.com/2012/11/quicksort-array-in-java/
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}



        /*  Date default_date =new Date();
        PrintDetails dt = new PrintDetails();

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

       /* Pair<String,Integer> phoneNumber =
                new Pair<>("Bill's number", 1324);
        System.out.println(phoneNumber);
        Pair<Double,Double> point =
                new Pair<>(3.14, 2.32);
        System.out.println(point);*/

