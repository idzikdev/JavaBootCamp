package Java18;

import com.sun.istack.internal.NotNull;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppStreams {
    public static Stream<Student> createDataStream(){
        Student student1=new Student("Paweł",38,"123");
        Student student2=new Student("Jacek",34,"345");
        Student student3=new Student("Kasia",38,"341");
        Student student4=new Student("Tomasz",39,"3145");
        return Stream.of(student1,student2,student3,student4);
    }

    public static void main(String[] args) throws IOException {
        Predicate<Student> over30Predicate=student -> student.getAge()>30;
        Consumer<String> println= System.out::println;
        Function<Student,String> getStudentName=Student::getName;
        createDataStream().filter(over30Predicate).map(getStudentName).forEach(println);
        createDataStream().filter(over30Predicate).map(getStudentName).findFirst().ifPresent(System.out::println);
        System.out.println(createDataStream().map(getStudentName).filter(Objects::nonNull).anyMatch(s -> "Paweł".equals(s)));
        System.out.println(createDataStream().map(getStudentName).allMatch(s->new StringBuilder(s).reverse().equals(s)));
        Files.readAllLines(Paths.get("palindrom.txt")).stream().map(String::toLowerCase).allMatch(s->new StringBuilder(s).reverse().equals(s));
        System.out.println(Stream.generate(Math::random).limit(10).reduce(0.0, (aDouble, aDouble2) -> aDouble+aDouble2));
        createDataStream().map(Student::getAge).max(Comparator.naturalOrder()).ifPresent(System.out::println);
        createDataStream().map(Student::getAge).reduce(Integer::max).ifPresent(System.out::println);
        System.out.println(createDataStream().map(Student::getAge).collect(Collectors.toList()));
        System.out.println(createDataStream().map(Student::getAge).map(s->s.toString()).collect(Collectors.joining(",")));
        Map<Integer,List<Student>> list=createDataStream().collect(Collectors.groupingBy(Student::getAge));
        list.forEach((integer, students) -> students.stream().map(Student::getName).forEach(System.out::println));
        System.out.println(list);
        IntStream intStream=createDataStream().map(Student::getAge).mapToInt(value -> value.intValue());
        intStream.sorted().forEach(System.out::println);
    }
}
