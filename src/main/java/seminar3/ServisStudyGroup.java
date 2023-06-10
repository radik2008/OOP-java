package seminar3;

public class ServisStudyGroup {
    private int id;
    private StudyGroup group;

    public ServisStudyGroup(StudyGroup group) {
        this.group = group;
    }

    public void addStudent(String name, int age) {
        group.addStudent(new Student(++id, name, age));
    }


}
