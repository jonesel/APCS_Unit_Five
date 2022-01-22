public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int x, int y)
    {
        if(y<0){
            if(x>=0){
            numerator=x+1;
            denominator=y*-1;
        }
    }
    if(y<0){
        if(x<0){
            numerator=x*-1;
            denominator=x*-1;
        }
    }
      else{
          numerator=x;
          denominator=y;
    }
      int dividend= GCD(x, y);
      numerator/=dividend;
      denominator/=dividend;
    }

    public static int GCD(int x, int y){
        while(x%y!=0){
            int a=x;
            int b=y;
            x=b;
            y=a%b;

        }
        return Math.abs(y);
    }

    public static Fraction add(Fraction a, Fraction b) {
        int x = a.numerator * b.denominator;
        int x2 = a.denominator * b.denominator;
        int y = b.numerator * a.denominator;
        int y2 = b.denominator * a.denominator;
        int x3 = x+y;
        Fraction f3 = new Fraction(x3,x2);
        return f3;
    }
    public static Fraction subtract(Fraction a, Fraction b) {
        int x = a.numerator * b.denominator;
        int x2 = a.denominator * b.denominator;
        int y = b.numerator * a.denominator;
        int y2 = b.denominator * a.denominator;
        int x3 = x-y;
        Fraction f3 = new Fraction(x3,x2);
        return f3;
    }
    public static Fraction Multiply(Fraction a,Fraction b){
        int x = a.numerator * b.numerator;
        int y=a.denominator * b.denominator;
        Fraction F3 = new Fraction(x,y);
        return F3;
    }
    public static Fraction divide(Fraction a, Fraction b) {
        int x = a.numerator * b.denominator;
        int y = a.denominator * b.numerator;
        Fraction F3 = new Fraction(x, y);
        return F3;
    }
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public String toString(){
        if(numerator>denominator){
            int x=numerator/denominator;
            int y=numerator%denominator;
            return ""+x+""+y+"/"+denominator;
        }
        else {
            return ""+numerator+"/"+denominator;
        }
    }
}
