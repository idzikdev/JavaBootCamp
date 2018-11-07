package DesignPatterns.BuilderPattern;

/**
 * Created by operator on 02.07.2017.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person=new PersonBuilder().setName("TOMASZ").setAge(36).setPesel("21212").setSurname("IDZIK").build();
        System.out.println(person);
    }
}
