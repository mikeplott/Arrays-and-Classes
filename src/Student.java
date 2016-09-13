/**
 * Created by michaelplott on 9/12/16.
 */
public class Student {
    // represents a student if they are currently attending school and contains a list of their grades
    String name;
    int age;
    String dateOfBirth;
    boolean isAttending;
    double[] grades = new double[5];

    Student(String newName, int newAge, String newDateOfBirth, boolean newIsAttending, double[] newGrades) {
        setName(newName);
        setAge(newAge);
        setDateOfBirth(newDateOfBirth);
        setIsAttending(newIsAttending);
        setGrades(newGrades);
    }

    String getName() {
        return name;
    }
    void setName(String newName) {
        name = newName;
    }

    int getAge() {
       return age;
    }

    void setAge(int newAge) {
        if (age > 18) {
            age = newAge;
        }
    }

    String getDateOfBirth() {
        return dateOfBirth;
    }

    void setDateOfBirth(String newDateOfBirth) {
        dateOfBirth = newDateOfBirth;
    }

    boolean getIsAttending() {
        return isAttending;
    }

    void setIsAttending(boolean newIsAttending) {
        isAttending = newIsAttending;
    }

    double[] getGrades() {
        return grades;
    }

    void setGrades(double[] newGrades) {
        grades = newGrades;
    }

}
