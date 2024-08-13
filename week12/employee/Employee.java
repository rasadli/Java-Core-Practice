package week12.employee;

public class Employee {

    private String firstName;
    private Integer age;
    private Double salary;

    public Employee(String firstName, Integer age, Double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", age=" + age + ", salary=" + salary + "]";
    }

}
