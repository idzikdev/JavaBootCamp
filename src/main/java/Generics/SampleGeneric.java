package Generics;

import java.util.Collection;

/**
 * Created by operator on 05.07.2017.
 */
public class SampleGeneric<T extends Collection<?>,S> {
    T myType1;
    S myType2;
    public void change(T typ1,S typ2){
        myType1=typ1;
        myType2=typ2;
    }
    public T getMyType1(){
        return myType1;
    }
    public S getMyType2(){
        return myType2;
    }
    public void showType(){
        //if (myType1 instanceof String) System.out.println("To String");
        //if (myType2 instanceof Integer) System.out.println("To Integer");
    }
    public SampleGeneric(T myType1,S myType2) {
        this.myType1 = myType1;
        this.myType2 = myType2;
    }

    @Override
    public String toString() {
        return "SampleGeneric{" +
                "myType1=" + myType1 +
                ", myType2=" + myType2 +
                '}';
    }
}
