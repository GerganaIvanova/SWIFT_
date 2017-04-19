package homework7;

public class Student extends Person {

    private int facultyNumber;
    private int lectureCount;
    private int exerciseCount;
    private int dayLectures;
    private int dayExercises;

    public Student(String firstName, String lastName, int facultyNumber, int lectureCount, int exerciseCount) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
        this.lectureCount = lectureCount;
        this.exerciseCount = exerciseCount;
    }

    void names() {
        System.out.println(name());
    }

    void lectures() {
        dayLectures = lectureCount / 5;
        //System.out.printf("%nLectures per day:%d", dayLectures);
    }

    void Exercises() {
        dayExercises = exerciseCount / 5;
        System.out.printf("%nFirst name:%s. %nLast name:%s. %nFaculty number:%d. %nExercises per day:%d. %nLectures per day:%d",
                firstName, lastName, facultyNumber, lectureCount, dayExercises);
    }
}
