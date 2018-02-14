/**
 * Created by bobby_000 on 09/02/2018.
 */
//ex 4
public class Rational {


    //Rationals are easily reduced to their lowest terms by dividing the numerator and denominator by their greatest common divisor
    private int numerator;
    private int denominator;

    Rational(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }
    Rational()
    {
        //and the no-args constructor which creates the rational 0
        numerator=0;
        denominator=0;
    }
    Rational lowestform()
    {
        Rational p= new Rational();
        p.numerator=numerator;
        p.denominator=denominator;
         if(p.numerator%p.denominator!=0) {
        // e.g if you have 8/12 ==2/3 Divide both the top and bottom of the fraction by the Greatest Common Factor
            int tempgcd=gcd(numerator,denominator);
             p.numerator =p.numerator/tempgcd;
             p.denominator=p.denominator/tempgcd;
             return p;
        }return p;
    }


    //Rational numbers can be added, subtracted, multiplied, and divided. For example, a/b+c/d equals (ad+bc)/bd.
    Rational add(Rational p)
    {
        //get gcd then multiply gcd by the denominator  of both then just add both numerator
        //https://www.mathsisfun.com/fractions_addition.html formulae for fraction

        Rational firstarg =new Rational();
        //firstargument being used to store the instance variable so i can call lowest form it's just the most convienet way that i'm aware of of being able to call the method on the insatnce variables
        firstarg.numerator=numerator;
        firstarg.denominator=denominator;

        firstarg=firstarg.lowestform();
        p=p.lowestform();
        //need to get it in it's lowest form before you can work with it
        int tempgcd=gcd(firstarg.denominator,p.denominator);
        if(firstarg.denominator==p.denominator)
        {
            // if both denominators are the same just gott add the numerator
            p.numerator=p.numerator+firstarg.numerator;
            return p;
        }
        else if(tempgcd==1)
        {
            int tempdenominator=p.denominator;

            p.denominator=firstarg.denominator*p.denominator;
            p.numerator=p.numerator*firstarg.denominator;

            //calculate the second fraction
            firstarg.numerator=firstarg.numerator*tempdenominator;
            firstarg.denominator=firstarg.denominator*tempdenominator;

            //now just add the numerators
            p.numerator=p.numerator+firstarg.numerator;

            return p;
        }
        else if(tempgcd>1)
        {

            p.denominator=tempgcd*p.denominator;
            p.numerator=p.numerator*tempgcd;
            //calculate the second fraction by getting the gcd and multiplying it by the top and bottom of bot fractions
            firstarg.numerator=firstarg.numerator*tempgcd;
            firstarg.denominator=firstarg.denominator*tempgcd;
            //now just add the numerators
            p.numerator=p.numerator+firstarg.numerator;

            return p;
        }
        return null;
    }
    Rational subtract(Rational p){

        //same as addd just minusing the numerator

        //get gcd then multiply gcd by the denominator  of both then just add both numerator
        //https://www.mathsisfun.com/fractions_addition.html formulae for fraction

        Rational firstarg =new Rational();
        firstarg.numerator=numerator;
        firstarg.denominator=denominator;

        firstarg=firstarg.lowestform();
        p=p.lowestform();
        //need to get it in it's lowest form before you can work with it
        int tempgcd=gcd(firstarg.denominator,p.denominator);
        if(firstarg.denominator==p.denominator)
        {
            // if both denominators are the same just got to add the numerator
            p.numerator=firstarg.numerator-p.numerator;;
            return p;
        }
        else if(tempgcd==1)
        {
            int tempdenominator=p.denominator;

            p.denominator=firstarg.denominator*p.denominator;
            p.numerator=p.numerator*firstarg.denominator;

            //calculate the second fraction
            firstarg.numerator=firstarg.numerator*tempdenominator;
            firstarg.denominator=firstarg.denominator*tempdenominator;

            //now just add the numerators
            p.numerator=firstarg.numerator-p.numerator;;

            return p;
        }
        else if(tempgcd>1)
        {

            p.denominator=tempgcd*p.denominator;
            p.numerator=p.numerator*tempgcd;
            //calculate the second fraction by getting the gcd and multiplying it by the top and bottom of bot fractions
            firstarg.numerator=firstarg.numerator*tempgcd;
            firstarg.denominator=firstarg.denominator*tempgcd;
            //now just add the numerators
            p.numerator=firstarg.numerator-p.numerator;

            return p;
        }
        return null;

    }
    Rational multiply(Rational p){
        // just multiply the top and buttom
        // odly enough if i were to return p then r2 value whould change into the sum of the multiuplication ..dunno why yet though e.g if it was p.numerator * numerator =? p.denonmiator *denominator =? the answer i get changes the value of r2 wjhich effects the next print statement ..same thing happens with divide
        Rational firstarg=new Rational();
        firstarg.numerator=numerator;
        firstarg.denominator=denominator;

        firstarg.numerator=p.numerator*firstarg.numerator;
        firstarg.denominator=p.denominator*firstarg.denominator;
        return firstarg;
    }
    Rational divide(Rational p){
        // to divide need to turn the opposing fraction upsine down e.g 4/1 would be 1/4 then just multiply the fractions
        //todi basically fix this function so it can return first arg and stops changing the r2 value for the next method or whatever method that may need it
        Rational firstarg=new Rational();
        firstarg.numerator=numerator;
        firstarg.denominator=denominator;


        firstarg.numerator=firstarg.numerator*p.denominator;
        firstarg.denominator=p.numerator*firstarg.denominator;
        return firstarg;
    }

    public String toString()
    {

        //The string returned by toString should represent the rational in its lowest terms, and represent whole integers as plain integers (e.g. 5/1 should be represented as 5)
        if(denominator==1)
        return numerator+""; //e.g 4/1 =4 5/1 =5 etc
        else if(numerator%denominator==0)
        {
            return ""+numerator/denominator; //e.g  4/2 =2
        }
        else if(numerator%denominator!=0) {
            // e.g if you have 8/12 ==2/3 Divide both the top and bottom of the fraction by the Greatest Common Factor
            int tempgcd=gcd(numerator,denominator);
          return  numerator/tempgcd +"/" + denominator/tempgcd;

        }
        return null;
    }
    double doubleValue()
    {
        // 1)Provide also a method doubleValue which returns a real number of type double that approximates the rational
        //2) i think this has something to doo with floor and ceiling so for example 13/3 the ceiling would be 4 while the floor would be 3 but it can only return one value if the remainder is greater than .5 then you use ceiling if not use the floor
        //3) or it's just looking for you to return the fraction as a
        //i think it's the third option
        double top = 1.0 * numerator;
        double bottom=1.0*denominator;
        top=top/bottom;
        return top;

    }
    static int gcd(int m, int n) {// gcd of m,n
        int m1 = Math.abs(m);
        int n1 = Math.abs(n);
        if (m1<=n1) return gcd2(m1,n1);
        else return gcd2(n1,m1);
    }

    static int gcd2(int m, int n) {// gcd of m,n assuming 0<=m<=n
        if (m==0) return n;
        else return gcd2(n%m,m);
    }


}
