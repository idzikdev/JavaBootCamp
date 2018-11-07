package Lambdas;

/**
 * Created by operator on 14.08.2017.
 */
public class MainLambda {
    public static void main(String[] args) {
        SimpleLambda lambda=(s,k)->{
            return "Imię " + s +" a nazwisko "+k;
        };
        System.out.println(lambda.getName("Tomasz","Idzik"));
        IntegerMath dodawanie=(a,b)->a+b;
        IntegerMath odejmowanie=(a,b)->a-b;
        IntegerMath mnozenie=(a,b)->a*b;
        IntegerMath dzielenie=(a,b)->{
            if (b==0){
                throw new ArithmeticException("Can't divide by zero!");
            }
            else return (a/b);
        };
        System.out.println("10 / 3="+operate(dzielenie,10,3));
    }


    private static double operate(IntegerMath lambda,double a,double b){
        return lambda.getNumber(a,b);
    }
}
