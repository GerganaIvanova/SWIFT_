package homework7;

import java.util.Scanner;
//import java.lang.Math;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker teacher = new Worker("Petar", "Petrov", 100.5, 6);
        Student student = new Student("Ivan", "Ivanov", 54445, 4, 6);
        teacher.Salary();
        student.lectures();
        student.Exercises();

    }

}
