package HW_11052023_LISTandSTUDENT;

public class Student {
    public Student(String firstName, String lastName, short year, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.gpa = gpa;
    }

    private String firstName;
    private String lastName;
    private short year; //курс обучения(1-n)
    private double gpa; //The GPA, or Grade Point Average, is a number that indicates how high you scored in your courses on average.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                '}';
    }


}