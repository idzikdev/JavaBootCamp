package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by operator on 05.07.2017.
 */
public class TestSampleGeneric {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        SampleGeneric<List<?>,Integer> sampleGeneric=new SampleGeneric<>(Arrays.asList("LA","LA"),15);
        System.out.println(sampleGeneric);
        sampleGeneric.change(Arrays.asList("LO","LA"),22);
        System.out.println(sampleGeneric);
        sampleGeneric.showType();
    }
}
