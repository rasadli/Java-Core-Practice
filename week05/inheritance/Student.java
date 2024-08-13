package week05.inheritance;

public class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, char gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student s = (Student) obj;
        return super.equals(obj) && this.studentId == s.studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", studentId=" + studentId;
    }
}
