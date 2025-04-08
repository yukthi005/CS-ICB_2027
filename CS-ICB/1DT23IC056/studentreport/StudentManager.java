import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student searchByRoll(int roll) {
        for (Student s : studentList) {
            if (s.getRollNumber() == roll) return s;
        }
        return null;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> list) {
        studentList = list;
    }
}
