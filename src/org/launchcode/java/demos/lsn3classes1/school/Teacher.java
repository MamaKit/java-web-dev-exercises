package org.launchcode.java.demos.lsn3classes1.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher (String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    private void setFirstName(String first) {
        firstName = first;
    }
    public String getFirstName(){
        return firstName;
    }

    private void setLastName(String last) {
        lastName = last;
    }
    public String getLastName() {
        return lastName;
    }

    private void setSubject(String subj) {
        subject = subj;
    }
    public String getSubject() {
        return subject;
    }

    private void setYearsTeaching(int years) {
        yearsTeaching = years;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
