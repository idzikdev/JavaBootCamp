package Annotations;

import java.lang.reflect.Method;

/**
 * Created by operator on 05.07.2017.
 */
public class Application
{
    public static void main( String[] args )
    {
        annoChecker();
        //new AppInterfaces();
    }
    public Application(){

    }
    @MyAnnotation(info="Musisz posiadać internet",usingInternet=true)
    public void testAnno(){
        System.out.println("Testing...");
    }

    private static void annoChecker(){
        Application app=new Application();
        boolean internet=false;
        for(Method m:app.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation my=m.getAnnotation(MyAnnotation.class);
                System.out.println("Nazwa metody "+m.getName());
                System.out.println("Opis metody "+m);
                if (my.usingInternet()){
                    if(!internet){
                        System.out.println(m.getName()+" "+my.info());
                    }
                }
            }
        }
    }
}
