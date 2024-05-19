package lld.JavaBasics.ComparatorVsComparable;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
        // sorts descending
        return arg1.age - arg0.age;
    }

}
