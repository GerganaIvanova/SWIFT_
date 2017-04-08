
package Task2_Classes_Person;

public class Person {
    String name;
    int years;

    Person() {
        name = "No name";
        years = -1;
    }

    Person(String name) {
        this.name = name;
        years = -1;
    }

    Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    boolean isOld() {
        
        if (years < 0 || years > 150) {
            System.out.println("Not possible");
            return true;
        }
        return false;
    }

    void introduce() {
        if(this.isOld()) {
            return;
        }
        
        System.out.printf("Hello, I am %s. I am %d years old", name, years);
        if (name == "No name") {
            System.out.println("I am John Doe");
        }
        if (years <= 0) {
            System.out.printf("Hello, I am %s.", name);
        }
    }
    
}
