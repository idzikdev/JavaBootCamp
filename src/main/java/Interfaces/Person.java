package Interfaces;

/**
 * Created by operator on 01.07.2017.
 */
public class Person {
    private String name;

    private String surname;

    public Person(String name, String surname) {
        super();
        this.setName(name);
        this.setSurname(surname);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
