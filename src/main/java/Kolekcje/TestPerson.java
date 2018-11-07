package Kolekcje;

import java.util.Scanner;

/**
 * Created by operator on 01.07.2017.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person.addPerson("Michał", "Makowski", 33, 175, 82);
        Person.addPerson("Tomasz", "Kowalski", 38, 186, 92);
        Person.addPerson("Dorota", "Jankowska", 30, 176, 58);

        String wybor = "0";
        Scanner readLoop = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        String name1;
        String surname1;
        int age1;
        int height1;
        double weight1;
        do {
            System.out.println("-----------");
            Person.clearConsole();
            System.out.println("Enter your choice");
            System.out.println("0.Exit");
            System.out.println("1.Add new person");
            System.out.println("2.Search for person");
            System.out.println("3.Delete a person");
            System.out.println("4.Search min");
            System.out.println("5.Search max");
            System.out.println("6.Sort list of persons");
            System.out.println("7.View a list of persons");
            wybor = read.nextLine();
            switch (Integer.parseInt(wybor)) {
                case 0:
                    System.out.println("Your choose EXIT");
                    break;
                case 1:
                    System.out.println("Your choice 1");
                    System.out.println("Give name:");
                    name1=readLoop.nextLine();
                    System.out.println("Give surname:");
                    surname1=readLoop.nextLine();
                    System.out.println("Give age:");
                    age1=Integer.parseInt(readLoop.nextLine());
                    System.out.println("Give height:");
                    height1=Integer.parseInt(readLoop.nextLine());
                    System.out.println("Give weight:");
                    weight1=Integer.parseInt(readLoop.nextLine());
                    Person.addPerson(name1, surname1, age1, height1, weight1);
                    break;
                case 2:
                    System.out.println("Your choice Search for Person");
                    Person.searchPerson();
                    break;
                case 3:
                    System.out.println("Your choice 3 Delete a Person");
                    Person.deletePerson();
                    break;
                case 4:
                    System.out.println("Your choice 4 Search min Person");
                    Person.minPerson();
                    break;
                case 5:
                    System.out.println("Your choice 5 Search max Person");
                    Person.maxPerson();
                    break;
                case 6:
                    System.out.println("Your choice 6 Sort Persons by params");
                    //Collections.sort(Person.lista);
                    Person.sortPerson();
                    System.out.println(Person.getAllPerson());
                    break;
                case 7:
                    System.out.println("Your choice 7 View a list of Persons");
                    if (Person.liczba > 0)
                        System.out.println(Person.getAllPerson());
                    else
                        System.out.println("The list is empty");
                    break;
                default:
                    System.out.println("Incorrect number.Try again.Enter 0 to exit");
                    break;
            }
        } while (Integer.parseInt(wybor) > 0 && Integer.parseInt(wybor) < 8);
        readLoop.close();
        read.close();
    }
}
