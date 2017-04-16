package homework7;

public class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;

    }

    String name() {
        return this.firstName + " " + this.lastName;
    }

}
