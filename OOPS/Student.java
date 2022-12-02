public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private char gender;

    // Non-Parameterized or Default Explicit Constructor
    public Student() {
        rollNo = 1;
        name = "Anonymous";
        marks = 100.0;
        gender = 'N';
    }

    // Non-Parameterized or Default Implicit Empty Constructor
    // Provided by Compiler
    // public Student(){}

    // // Parameterized Constructor
    public Student(int newRollNo, String newName, double newMarks, char newGender) {
        rollNo = newRollNo;
        name = newName;
        marks = newMarks;
        gender = newGender;
    }

    // Getters: Public
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public char getGender() {
        return gender;
    }

    // Setters: Public
    public void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }

    public void setMarks(double newMarks) {
        marks = newMarks;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public void setName(String newName) {
        name = newName;
    }
}
