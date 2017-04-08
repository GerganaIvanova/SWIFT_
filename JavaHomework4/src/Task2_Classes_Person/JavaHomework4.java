package Task2_Classes_Person;

import java.util.Scanner;

public class JavaHomework4 {

    public static void main(String[] args) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        person.name = sc.nextLine();
        System.out.print("Enter years: ");
        person.years = sc.nextInt();
        person.introduce();
    }

}
