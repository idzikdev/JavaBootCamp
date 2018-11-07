package Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by operator on 05.07.2017.
 */
public class ZadanieKlasa {
    @ZadanieAnnotation(englishName = "factor",polishName = "współczynnik",value = 1)
    private double factor_a;
    @ZadanieAnnotation(englishName = "factor",polishName = "współczynnik",value = -5)
    private double factor_b;
    @ZadanieAnnotation(englishName = "factor",polishName = "współczynnik",value = 6)
    private double factor_c;
    @ZadanieAnnotation(englishName = "delta",polishName = "delta",value = 1)
    private double delta;
    @ZadanieAnnotation(englishName = "rozwiązanie1",polishName = "solution1",value = 2)
    private double solution1;
    @ZadanieAnnotation(englishName = "rozwiązanie2",polishName = "solution2",value = 3)
    private double solution2;
    @ZadanieAnnotation(englishName = "calculating",polishName = "obliczanie",value = 1)
    public double calculateDelta(){
        return factor_b*factor_b-4*factor_a*factor_c;
    }
    @ZadanieAnnotation(englishName = "calculating",polishName = "obliczanie",value=1)
    public boolean calculateSolution(){
        if (delta>=0){
            solution1=(-factor_b-Math.sqrt(delta))/(2*factor_a);
            solution2=(-factor_b-Math.sqrt(delta))/(2*factor_a);
            return true;
        }
        return false;
    }

    public ZadanieKlasa(double factor_a, double factor_b, double factor_c) {
        this.factor_a = factor_a;
        this.factor_b = factor_b;
        this.factor_c = factor_c;
        this.delta=calculateDelta();
    }
    @ZadanieAnnotation(englishName = "printing",polishName = "wyświetlanie",value = 2)
    public void calculate(){
        if (calculateSolution()) {
            System.out.println("Solution 1 : "+solution1);
            System.out.println("Solution 2 : "+solution2);
        }
        else System.out.println("There is no solution");
    }
    @ZadanieAnnotation(englishName = "main",polishName = "main",value = 0)
    public static void main(String[] args) {
        System.out.println("Enter factors");
        System.out.println("Enter a");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        System.out.println("Enter b");
        double b=scanner.nextDouble();
        System.out.println("Enter c");
        double c=scanner.nextDouble();
        ZadanieKlasa zadanieKlasa=new ZadanieKlasa(a,b,c);
        zadanieKlasa.calculate();

        for (Method metoda:zadanieKlasa.getClass().getDeclaredMethods())
            if(metoda.isAnnotationPresent(ZadanieAnnotation.class)){
                ZadanieAnnotation my=metoda.getAnnotation(ZadanieAnnotation.class);
                if (my.englishName().equals("calculating")){
                    System.out.println("The method "+metoda.getName() +" is calculating");
                }
            }
        for (Field pole:zadanieKlasa.getClass().getDeclaredFields())
            if (pole.isAnnotationPresent(ZadanieAnnotation.class)){
                ZadanieAnnotation my=pole.getAnnotation(ZadanieAnnotation.class);
                if (my.polishName().equals("współczynnik")){
                    System.out.println("The field "+pole.getName()+" is a factor");
                }
            }
    }
}
