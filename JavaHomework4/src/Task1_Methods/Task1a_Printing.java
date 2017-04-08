package Task1_Methods;

import java.util.Scanner;

public class Task1a_Printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter years: ");
        int years = sc.nextInt();
        print(name, years);
    }

    public static void print(String name, int years) {
        System.out.printf("%s is %d years old.", name, years);
    }

}
