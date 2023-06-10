package seminar3;

import seminar3.comparator.ComparateByAge;

import java.util.*;
import java.util.function.Consumer;

public class StudyGroup implements Iterable<Student> {
    private List<Student> students;
    private int numGroup;


    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

//    @Override
//    public Iterator<Student> iterator() {        ///второй способ реализовать итератор
//        return new StudentIterator(students);
//    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        Iterable.super.forEach(action);
    }



    @Override
    public Iterator<Student> iterator() {   ///первый способ реализовать итератор
        return students.iterator();
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        students.sort(new ComparateByAge());
    }
}
