/**
 * Created by bobby_000 on 09/02/2018.
 */

class Point {

    private double x, y; // coordinates

    Point(double x0, double y0){ // all-args constructor
        x = x0; y = y0;
    }

    Point(){}; // no-args constructor (defaults apply)

    void get() {
        x = Console.readDouble();
        y = Console.readDouble();
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public void midpoint_print() {

        System.out.print("The midpoint is "+"("+x+","+y+")");
    }

    Point midpoint(Point point)
    {
        //returns an object of type Point representing the midpoint of two points

        point.x= point.x + x; // represent x1 x2
        point.y=point.y+y; //represents y1 y2

        point.x=point.x/2.0;
        point.y=point.y/2.0;

        return point;
    }

}
