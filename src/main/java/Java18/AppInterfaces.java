package Java18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppInterfaces {
    public static List<Student> createData(){
        List<Student> result=new ArrayList<>(
               Arrays.asList(
                    new Student("Paweł",38,"123"),
                    new Student("Jacek",34,"345"),
                    new Student("Kasia",38,"341"),
                    new Student("Tomasz",39,"3145")
                )
        );
        return result;
    }
    public static List<Student> getStudents(Supplier<List<Student>> supplier,Predicate<Student> predicate){
        List<Student> result=new ArrayList<>();
        List<Student> students=supplier.get();
        for (Student student:students
             ) {
            if (predicate.test(student))result.add(student);
        }
        return result;
    }
    public static void consumeStudents(List<Student>list,Function<Student,String> function,Consumer<String>consumer){
        for (Student student:list
             ) {
            consumer.accept(function.apply(student));
        }
    }
    public static void main(String[] args) {
        List<Student> students=createData();
        Supplier<List<Student>> supplyStudentList= AppInterfaces::createData;
        Function<Student,String> functionStudentName= Student::getName;
        Predicate<Student> kasiaPredicate=student -> student.getName().equals("Kasia");
        Predicate<Student> equals38Predicate=student -> student.getAge()==38;
        Consumer<Student> printName= student -> System.out.println(student.getName());
        Consumer<String> printString= string-> System.out.println(string);
        Consumer<Student> printAge=student -> System.out.println(student.getAge());
        Consumer<Student> two=printName.andThen(printAge);
//        consumeStudents(getStudents(supplyStudentList,kasiaPredicate),functionStudentName,printString);
        Optional<Indeks> indeks=supplyStudentList.get().get(0).getIndex();
        if (indeks.isPresent()){
            System.out.println(indeks.get().getIndexNumber());
        }
        indeks.ifPresent(i -> System.out.println(i));
        indeks.filter(i->i.getIndexNumber().equals("123")).ifPresent(i-> System.out.println(i.getIndexNumber()));
        indeks.map(i->i.getIndexNumber()).filter(number->number.equals("123")).ifPresent(index-> System.out.println(index));
        supplyStudentList.get().stream().filter(kasiaPredicate).map(Student::getName).forEach(printString);
//        Stream.of("A","B","C").forEach(printString);
//        List<Student> studentList1=createData();
//        studentList1.stream().filter(kasiaPredicate).forEach(printName);
//        Stream.generate(supplyStudentList).forEach(printName);
//        Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
        Stream.iterate(1,i->i+2).limit(20).forEach(System.out::println);
        IntStream.rangeClosed(5,100).filter(i->i%2==0).forEach(System.out::println);
    }
}