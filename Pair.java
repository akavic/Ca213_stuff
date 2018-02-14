/**
 * Created by bobby_000 on 10/02/2018.
 */

// just sample generic class bag is a list of itmes wich are unorganised(have no position )
public class Pair<T,E> {
//ex 1
    T x;
    E y;

    Pair(T x,E y)
    {
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        return x +","+ y;
    }

//    ex 2




}
