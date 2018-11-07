package DesignPatterns.BuilderPattern;

/**
 * Created by operator on 02.07.2017.
 */
public class Person {
    private String pesel;
    private String name;
    private String surname;
    private int age;

    public Person(PersonBuilder personBuilder) {
        this.pesel = personBuilder.getPesel();
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }



}
