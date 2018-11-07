package Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * Created by operator on 30.06.2017.
 */
public class Sample {
    public static void main(String[] args) {
        try {
            Class<?> mojaKlasa = Class.forName("Reflections.Data");
            for (Method m : mojaKlasa.getMethods()) {
                System.out.println("Nazwa metody :"+m.getName());
                for (Class<?> parametr : m.getParameterTypes()){
                    System.out.println(" a typ argumentu:"+parametr.getName());
                }
                for (TypeVariable d:m.getTypeParameters()){
                    System.out.println(" a typ wyniku :"+d.getName());
                }
            }
            Object konstruktor = mojaKlasa.newInstance();
            Method funkcja=konstruktor.getClass().getMethod("returnName",String.class,String.class);
            Object wynik=funkcja.invoke(konstruktor,"HERE I AM"," AND ME");
            System.out.println(wynik);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

