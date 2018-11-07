package Interfaces;

/**
 * Created by operator on 01.07.2017.
 */
public class Employee extends Person implements Comparable<Employee> {

    private double salary;

    public Employee(String name, String surname) {
        super(name, surname);
        }

    public Employee(String name, String surname, double salary) {
        this(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary == o.salary) {
            return 0;
        }
        if (this.salary > o.salary) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +super.getName()+ " "+super.getSurname()+" "+
                "salary=" + salary +
                '}';
    }
}
