/**
 * Created by bobby_000 on 10/02/2018.
 */

class Bag<T extends Comparable<T>> {// generic class with T standing for a class

    private T[] bag = (T[])(new Comparable[100]);
    private int numElements = 0; // junk in bag[numElements..]

    void add(T x) { // put x in bag
        bag[numElements] = x; numElements++;
    }

    int freq(T x) { // how many x�s in bag?
        int count = 0;
        for (int i=0; i<numElements; i++)
            if (bag[i].equals(x)) // .equals because T a class
                count++;
        return count;
    }
    void remove(T x)
    {
        // deletimng and adding elements uses void
        for(int i =0;i<bag.length;i++)
        {
            T temp;
            //swap the location of the item that need s to be changed with the last item then just return the counter -1
            if(bag[i].equals(x))
            {
               temp=bag[i];
                bag[i]=bag[numElements];
                bag[numElements]=temp;
                numElements--;
            }
        }
    }

//    ex 4
//   Enhance the generic Bag given in the lecture notes so that for b a bag we can invoke b.numGreater(x) to compute the number of items in b that are greater than x
//    Note that numGreater requires that the items in the bag implement the Comparable interface
// - for less, 0 for equal, + for greater
    public int numGreater( T [] bag_two) {
        bag_two=(T[])(new Comparable[100]);
        int numgreatvar=0;

        for(int i=0;i<bag_two.length;i++)
        {
            if(bag[i].compareTo(bag_two[i])>0)
            {
                numgreatvar=numgreatvar+numgreatvar++;
            }
        }
        return numgreatvar;
    }


}

