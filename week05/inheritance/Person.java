package week05.inheritance;

public class Person extends Object {
    private String firstName;
    private String lastName;
    private char gender;

    public Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.gender = 'm';
    }

    public Person(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return 
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender ;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person p = (Person) obj;
        return (this.firstName == p.firstName && this.lastName == p.lastName && this.gender == p.gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
