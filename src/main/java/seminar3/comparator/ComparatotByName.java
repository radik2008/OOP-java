package seminar3.comparator;

import seminar3.Student;

import java.util.Comparator;

public class ComparatotByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}