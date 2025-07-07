package org.example;

public class Student {

    private String vorname;
    private String nachname;
    private int studentID;

    public Student(String vorname, String nachname, int studentID) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.studentID = studentID;
    }
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getStudentId() {
        return studentID;
    }

    // Ausgabe
    @Override
    public String toString() {
        return "Student{" +
                "Vorname='" + vorname + '\'' +
                ", Nachname='" + nachname + '\'' +
                ", ID='" + studentID + '\'' +
                '}';

    }

}
