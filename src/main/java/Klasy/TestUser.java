package Klasy;

import java.util.ArrayList;

/**
 * Created by operator on 25.02.2017.
 */
public class TestUser {
    static ArrayList<User> lista = new ArrayList<User>();

    public static void main(String[] args) {
        User u1 = new User("login1", "Pass1", "Tomasz", "Jankowski");
        User u2 = new User("login2", "Pass2", "Pawe│", "Kowal");
        lista.add(u1);
        lista.add(u2);
        TestUser.getAll();
    }

    public static void getAll() {
        System.out.println(lista);
    }
}
