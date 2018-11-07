package Klasy;

/**
 * * Stwórz klasę Osoba posiadającą następujące dane takie jak:
 - name,
 - surname,
 - age,
 - gender.
 Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody
 dostępowe do zmiennych obiektu. Stwórz przykładowe obiekty.
 *
 * Created by operator on 25.02.2017.
 */
public class Osoba {
    private String name;
    private String surname;
    private int age;
    private boolean gender; // true - kobieta

    public Osoba(String name, String surname, int age, boolean gender) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "," + surname + " ";
    }

    static public String getAllPeople(Osoba[] osoby) {
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < osoby.length; i++) {
            wynik.append(osoby[i].toString());
        }
        return wynik.toString();
    }

    public static void main(String[] args) {
        Osoba o1 = new Osoba("Tomasz", "Jankowski", 18, false);
        Osoba o2 = new Osoba("Janusz", "Tomaszewski", 38, false);
        Osoba o3 = new Osoba("Agnieszka", "Solarska", 28, false);
        Osoba[] osoby = new Osoba[3];
        osoby[0] = o1;
        osoby[1] = o2;
        osoby[2] = o3;
        System.out.println(Osoba.getAllPeople(osoby));

    }


}
