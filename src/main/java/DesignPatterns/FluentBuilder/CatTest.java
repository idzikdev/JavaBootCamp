package DesignPatterns.FluentBuilder;

public class CatTest {
    public static void main(String[] args) {
        Cat cat=new Cat.Builder("kotek")
                .setAge(11).build();
        System.out.println(cat);
    }
}
