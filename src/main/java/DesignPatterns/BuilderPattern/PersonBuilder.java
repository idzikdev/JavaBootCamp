package DesignPatterns.BuilderPattern;

/**
 * Created by operator on 02.07.2017.
 */
public final class PersonBuilder{
    private String pesel;
    private String name;
    private String surname;
    private int age;

    public PersonBuilder setPesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build(){
        return new Person(this);
    }
}
