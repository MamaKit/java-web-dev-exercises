package org.launchcode.java.demos.lsn3classes1.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentID, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public String getName () {
        return name;
    }
    private void setName (String aName) {
        name = aName;
    }

    public int getStudentID () {
        return studentId;
    }
    private void setStudentId (int aStudentID) {
        studentId = aStudentID;
    }

    public int getNumberOfCredits () {
        return numberOfCredits;
    }
    private void setNumberOfCredits (int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa () {
        return gpa;
    }
    private void setGpa (double aGpa) {
        gpa = aGpa;
    }

}