package Java18;

import java.util.Optional;

final public class Student {
    private String name;
    private int age;
    private Indeks index;

    public Student(String name, int age,String indexNumber) {
        this.name = name;
        this.age = age;
        this.index = new Indeks(indexNumber);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Optional<Indeks> getIndex() {
        return Optional.ofNullable(index);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", index=" + index +
                '}';
    }
    public Student changeIndexNumber(String indexNumber){
        return new Student("Paweł",39,indexNumber);
    }
}
