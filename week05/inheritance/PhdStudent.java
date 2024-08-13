package week05.inheritance;

import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, char gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhdStudent pStud = (PhdStudent) obj;
        return super.equals(obj) && this.department.equals(pStud.department) && Arrays.equals(this.courses, pStud.courses);
    }
}
