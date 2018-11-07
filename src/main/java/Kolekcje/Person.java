package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by operator on 01.07.2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private int height;
    private double weight;
    private static List<Person> lista = new ArrayList<Person>();

    public static int liczba;

    public static int numberOfPerson() {
        return liczba;
    }

    public static void addPerson(String name, String surname, int age, int height, double weight) {
        Person person = new Person(name, surname, age, height, weight);
        Person.lista.add(person);
        liczba++;
    }

    public static List<Person> getAllPerson() {
        return lista;
    }

    public static void searchPerson() {
        // switch name,surname,age,height,weight
        Scanner read = new Scanner(System.in);
        Scanner nameScanner=new Scanner(System.in);
        int choice = 1;
        System.out.println(choice);
        do {
            System.out.println("Find a person by");
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Age");
            System.out.println("4.Height");
            System.out.println("5.Weight");
            String choicename;
            choice=read.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("0.Exit");
                    break;
                case 1:
                    System.out.println("1.Name");
                    System.out.println("Enter Name");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getName().equalsIgnoreCase(choicename)) System.out.println(person);
                    }
                    break;
                case 2:
                    System.out.println("2.Surname");
                    System.out.println("Enter Surname");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getSurname().equalsIgnoreCase(choicename)) System.out.println(person);
                    }
                    break;
                case 3:
                    System.out.println("3.Age");
                    System.out.println("Enter Age");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getAge()==Integer.parseInt(choicename)) System.out.println(person);
                    }
                    break;
                case 4:
                    System.out.println("4.Height");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getHeight()==Integer.parseInt(choicename)) System.out.println(person);
                    }
                    break;
                case 5:
                    System.out.println("5.Weight");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getWeight()==Integer.parseInt(choicename)) System.out.println(person);
                    }
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (choice > 1 && choice < 6);
        //System.out.println(choice);
        read.close();
        nameScanner.close();
    }
    public static void minPerson(){
        Scanner read = new Scanner(System.in);
        Scanner nameScanner=new Scanner(System.in);
        int choice = 1;
        System.out.println(choice);
        do {
            System.out.println("Min a person by");
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Age");
            System.out.println("4.Height");
            System.out.println("5.Weight");
            String choicename;
            choice=read.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("0.Exit");
                    break;
                case 1:
                    System.out.println("1.Name");
                    Collections.sort(Person.lista,new ComparatorPersonName());
                    System.out.println(Person.lista.get(0));
                    break;
                case 2:
                    System.out.println("2.Surname");
                    Collections.sort(Person.lista,new ComparatorPersonSurname());
                    System.out.println(Person.lista.get(0));
                    break;
                case 3:
                    System.out.println("3.Age");
                    Collections.sort(Person.lista,new ComparatorPersonAge());
                    System.out.println(Person.lista.get(0));
                    break;
                case 4:
                    System.out.println("4.Height");
                    Collections.sort(Person.lista,new ComparatorPersonHeight());
                    System.out.println(Person.lista.get(0));
                    break;
                case 5:
                    System.out.println("5.Weight");
                    Collections.sort(Person.lista,new ComparatorPersonWeight());
                    System.out.println(Person.lista.get(0));
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (choice > 1 && choice < 6);
        //System.out.println(choice);
        read.close();
        nameScanner.close();
    }
    public static void maxPerson(){
        Scanner read = new Scanner(System.in);
        Scanner nameScanner=new Scanner(System.in);
        int choice = 1;
        System.out.println(choice);
        do {
            System.out.println("Max a person by");
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Age");
            System.out.println("4.Height");
            System.out.println("5.Weight");
            String choicename;
            choice=read.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("0.Exit");
                    break;
                case 1:
                    System.out.println("1.Name");
                    Collections.sort(Person.lista,new ComparatorPersonName());
                    System.out.println(Person.lista.get(lista.size()-1));
                    break;
                case 2:
                    System.out.println("2.Surname");
                    Collections.sort(Person.lista,new ComparatorPersonSurname());
                    System.out.println(Person.lista.get(lista.size()-1));
                    break;
                case 3:
                    System.out.println("3.Age");
                    Collections.sort(Person.lista,new ComparatorPersonAge());
                    System.out.println(Person.lista.get(lista.size()-1));
                    break;
                case 4:
                    System.out.println("4.Height");
                    Collections.sort(Person.lista,new ComparatorPersonHeight());
                    System.out.println(Person.lista.get(lista.size()-1));
                    break;
                case 5:
                    System.out.println("5.Weight");
                    Collections.sort(Person.lista,new ComparatorPersonWeight());
                    System.out.println(Person.lista.get(lista.size()-1));
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (choice > 1 && choice < 6);
        //System.out.println(choice);
        read.close();
        nameScanner.close();
    }

    public static void sortPerson(){
        Scanner read = new Scanner(System.in);
        Scanner nameScanner=new Scanner(System.in);
        int choice = 1;
        System.out.println(choice);
        do {
            System.out.println("Sort a person by");
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Age");
            System.out.println("4.Height");
            System.out.println("5.Weight");
            String choicename;
            choice=read.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("0.Exit");
                    break;
                case 1:
                    System.out.println("1.Name");
                    Collections.sort(Person.lista,new ComparatorPersonName());
                    System.out.println(Person.lista);
                    break;
                case 2:
                    System.out.println("2.Surname");
                    Collections.sort(Person.lista,new ComparatorPersonSurname());
                    System.out.println(Person.lista);
                    break;
                case 3:
                    System.out.println("3.Age");
                    Collections.sort(Person.lista,new ComparatorPersonAge());
                    System.out.println(Person.lista);
                    break;
                case 4:
                    System.out.println("4.Height");
                    Collections.sort(Person.lista,new ComparatorPersonHeight());
                    System.out.println(Person.lista);
                    break;
                case 5:
                    System.out.println("5.Weight");
                    Collections.sort(Person.lista,new ComparatorPersonWeight());
                    System.out.println(Person.lista);
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (choice > 1 && choice < 6);
        //System.out.println(choice);
        read.close();
        nameScanner.close();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", height=" + height + ", weight="
                + weight + "]";
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static void deletePerson(){
        Scanner read = new Scanner(System.in);
        Scanner nameScanner=new Scanner(System.in);
        int choice = 1;
        System.out.println(choice);
        do {
            System.out.println("Delete a person by");
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Age");
            System.out.println("4.Height");
            System.out.println("5.Weight");
            String choicename;
            choice=read.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("0.Exit");
                    break;
                case 1:
                    System.out.println("1.Name");
                    System.out.println("Enter Name");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getName().equalsIgnoreCase(choicename)) lista.remove(person);
                    }
                    break;
                case 2:
                    System.out.println("2.Surname");
                    System.out.println("Enter Surname");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getSurname().equalsIgnoreCase(choicename)) lista.remove(person);
                    }
                    break;
                case 3:
                    System.out.println("3.Age");
                    System.out.println("Enter Age");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getAge()==Integer.parseInt(choicename)) lista.remove(person);
                    }
                    break;
                case 4:
                    System.out.println("4.Height");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getHeight()==Integer.parseInt(choicename)) lista.remove(person);
                    }
                    break;
                case 5:
                    System.out.println("5.Weight");
                    choicename = nameScanner.nextLine();
                    for (Person person : lista) {
                        if (person.getWeight()==Integer.parseInt(choicename)) lista.remove(person);
                    }
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (choice > 1 && choice < 6);
        //System.out.println(choice);
        read.close();
        nameScanner.close();
        System.out.println(Person.getAllPerson());
    }


    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {

        }
    }

    @Override
    public int compareTo(Person o) {
        if (this.getSurname().compareTo(o.getSurname())<0)return -1;
        else if (this.getSurname().compareTo(o.getSurname())>0)return 1;
        return 0;
    }

    public Person(String name, String surname, int age, int height, double weight) {
        super();
        setName(name);
        setSurname(surname);
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }

}
