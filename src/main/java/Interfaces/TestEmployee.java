package Interfaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by operator on 01.07.2017.
 */
public class TestEmployee {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Adam", "Kowalski", 2000));
        employees.add(new Employee("Zdzisław", "Python", 1500.21));
        employees.add(new Employee("Ania", "Kowalczuk", 12222.41));
        employees.add(new Employee("Justyna", "Marczuk", 8000));
        employees.add(new Employee("Katarzyna", "Bochniarz", 1500));

        Collections.sort(employees);
        System.out.println("Posortowane elementy");
      //  System.out.println(employees);

        /*for (Employee e : employees) {
            System.out.println(e);
        }
        */

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

    }

}
