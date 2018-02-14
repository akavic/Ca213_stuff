class Period
{
    private Time starttime=new Time();
    private Time finishtime=new Time();


    void get()
    {
        starttime.get();
        finishtime.get();
    }
    boolean overlaps(Period p)
    {
//        ctrl and / together allows you to comment code
        //Two periods A and B overlap if the finish time of A is greater than the start time of B, and the finish time of B is greater than the start time of A.
         return finishtime.gt(p.starttime)&&p.finishtime.gt(starttime);
      }

}
