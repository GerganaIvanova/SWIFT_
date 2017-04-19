package homework7;

public class Worker extends Person {

    private double weekSalary;
    private double workHoursPerDay;
    double daySalary;
    double hourSalary;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    void names() {
        System.out.println(name());
    }

    void Salary() {
        daySalary = weekSalary / 40;
        hourSalary = daySalary / 8;
        System.out.printf("First name:%s. %nLast name:%s. %nSalary per week:%f. %nSalary per day:%f. %nSalary per hour:%f.",firstName, lastName, weekSalary, daySalary, hourSalary);
    }
}
