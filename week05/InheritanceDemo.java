package week05;

import week05.inheritance.*;

public class InheritanceDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Alice", "Smith", 'f');
        Person person2 = new Person("Alice", "Smith", 'f');
        System.out.println("Person 1 equals Person 2: " + person1.equals(person2));

        Student student1 = new Student("Bob", "Johnson", 'm', 12345);
        Student student2 = new Student("Bob", "Johnson", 'm', 12345);
        System.out.println("Student 1 equals Student 2: " + student1.equals(student2));

        Teacher teacher1 = new Teacher("Carol", "Davis", 'f', "Computer Science", new String[]{"Java", "Python"});
        Teacher teacher2 = new Teacher("Carol", "Davis", 'f', "Computer Science", new String[]{"Java", "Python"});
        System.out.println("Teacher 1 equals Teacher 2: " + teacher1.equals(teacher2));

        PhdStudent phdStudent1 = new PhdStudent("David", "Miller", 'm', 54321, "Engineering", new String[]{"Mechanical", "Electrical"});
        PhdStudent phdStudent2 = new PhdStudent("David", "Miller", 'm', 54321, "Engineering", new String[]{"Mechanical", "Electrical"});
        System.out.println("PhdStudent 1 equals PhdStudent 2: " + phdStudent1.equals(phdStudent2));

        Person person = new Person("Alice", "Smith", 'f');
        System.out.println("{ Person: " + person.toString() + "}");

        Student student = new Student("Bob", "Johnson", 'm', 12345);
        System.out.println("{ Student: " + student.toString() + "}");

        Teacher teacher = new Teacher("Carol", "Davis", 'f', "Computer Science", new String[]{"Java", "Python"});
        System.out.println("{ Teacher: " + teacher.toString() + "}");

        PhdStudent phdStudent = new PhdStudent("David", "Miller", 'm', 54321, "Engineering", new String[]{"Mechanical", "Electrical"});
        System.out.println("{ PhdStudent: " + phdStudent.toString() + "}");
    }
}
