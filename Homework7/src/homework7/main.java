package homework7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstName = new String[2];
        firstName[0] = sc.nextLine();
        firstName[1] = sc.nextLine();
        String[] lastName = new String[2];
        lastName[0] = sc.nextLine();
        lastName[1] = sc.nextLine();
        double weekSalary = sc.nextInt();
        double workHoursPerDay = sc.nextInt();
        Worker teacher = new Worker(firstName[0], lastName[0], weekSalary, workHoursPerDay);
        int facultyNumber = sc.nextInt();
        int lectureCount = sc.nextInt();
        int exerciseCount = sc.nextInt();
        Student student = new Student(firstName[1], lastName[1], facultyNumber, lectureCount, exerciseCount);

        teacher.Salary();

        student.lectures();

        student.Exercises();

    }

}
