package lld.JavaBasics.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // ============ Comparable (natural sorting or default sorting) ==============
        System.out.println("============= Comparable ============");
        List<Student> students = new ArrayList<>();

        students.add(new Student(20));
        students.add(new Student(10));
        students.add(new Student(30));
        students.add(new Student(7));

        // Collections.sort internally uses the compareTo method in object that
        // implemented Comparable
        Collections.sort(students);

        students.forEach(s -> System.out.println(s.age));

        // ============ Comparator (natural sorting or default sorting) ==============
        System.out.println("============= Comparator ============");
        List<Student> students1 = new ArrayList<>();

        students1.add(new Student(20, "john"));
        students1.add(new Student(10, "barn"));
        students1.add(new Student(30, "car"));
        students1.add(new Student(7, "handle"));

        Comparator<Student> ageComparator = (Student st1, Student st2) -> {
            return st1.age - st2.age;
        };
        students1.sort(ageComparator);
        students1.forEach(s -> System.out.println(s.age));

        Comparator<Student> nameComparator = (Student st1, Student st2) -> {
            return st1.name.compareTo(st2.name);
        };
        students1.sort(nameComparator);
        students1.forEach(s -> System.out.println(s.name));

        // You can pass comparator object like this
        students1.sort(new AgeComparator());
        students1.forEach(s -> System.out.println(s.age));

    }
}
