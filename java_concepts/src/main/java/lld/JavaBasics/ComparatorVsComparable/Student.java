package lld.JavaBasics.ComparatorVsComparable;

public class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age) {
        this.age = age;
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student st) {
        if (this.age < st.age) {
            return -1;
        } else if (this.age > st.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
