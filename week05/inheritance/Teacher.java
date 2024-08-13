package week05.inheritance;

import java.util.Arrays;

public class Teacher extends Person {
    private String department;

    private String[] courses;

    public Teacher(String name, String surname, char gender, String department, String[] courses) {
        super(name, surname, gender);
        this.department = department;
        this.courses = courses;
    }

    public Teacher() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Teacher t = (Teacher) obj;
        return super.equals(obj) && this.department.equals(t.department) && Arrays.equals(this.courses, t.courses);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) ;
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
}
