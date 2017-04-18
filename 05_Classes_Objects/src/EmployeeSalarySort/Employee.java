package EmployeeSalarySort;

public class Employee {

    String name;
    double salary;
    String position;
    String department;
    int age;
    String email;

    Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }
    public void print() {
        if(this.email != null){
            System.out.printf("%s, %s, %s,%s", this.name, this.position, this.department, this.email);    
        } else {
            System.out.printf("%s, %s, %s", this.name, this.position, this.department);
        }
    }
}
