package seminar3;

import com.sun.source.tree.LiteralTree;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator {
    private int index;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }


    @Override
    public boolean hasNext() {
        return students.size() > index;
    }

    @Override
    public Object next() {
        return students.get(index++);
    }
}
