package seminar3;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        ServisStudyGroup servisStudyGroup = new ServisStudyGroup(studyGroup);
        servisStudyGroup.addStudent("Vasia", 15);
        servisStudyGroup.addStudent("Petia", 14);
        servisStudyGroup.addStudent("Kolia", 16);
        servisStudyGroup.addStudent("Masha", 15);

        for (Student student : studyGroup) {
            System.out.println(student);
        }
        System.out.println();
        studyGroup.sortByName();
        for (Student student : studyGroup) {
            System.out.println(student);
        }
        System.out.println();
        studyGroup.sortByAge();
        for (Student student : studyGroup) {
            System.out.println(student);
        }

    }

}
