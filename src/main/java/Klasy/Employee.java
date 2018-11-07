package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Employee {
    private String name;
    private String surname;
    private int ageOfBirth;
    private int lengthOfWork;
    private static int sumOfSalaries;

    public Employee(String name, String surname, int ageOfBirth, int lengthOfWork) {
        super();
        this.name = name;
        this.surname = surname;
        this.ageOfBirth = ageOfBirth;
        this.lengthOfWork = lengthOfWork;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAgeOfBirth() {
        return ageOfBirth;
    }

    public void setAgeOfBirth(int ageOfBirth) {
        this.ageOfBirth = ageOfBirth;
    }

    public int getLengthOfWork() {
        return lengthOfWork;
    }

    public void setLengthOfWork(int lengthOfWork) {
        this.lengthOfWork = lengthOfWork;
    }

    @Override
    public String toString() {
        return "Pracownik [imie=" + name + ", nazwisko=" + surname + ", rok urodzenia=" + ageOfBirth + ", staż pracy="
                + lengthOfWork + "]";
    }

    public static int sumOfSalary() {
        return sumOfSalaries;
    }

}
