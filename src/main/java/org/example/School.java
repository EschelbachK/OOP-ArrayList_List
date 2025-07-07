package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> studentenListe;

    public School() {
        studentenListe = new ArrayList<>();
    }

    // ► Student hinzufügen
    public void addStudent(Student student) {
        studentenListe.add(student);
    }

    // ► Alle Studenten anzeigen
    public void showAllStudents() {
        if (studentenListe.isEmpty()) {
            System.out.println("Keine Studenten vorhanden.");
        } else {
            for (Student student : studentenListe) {
                System.out.println(student);
            }
        }
    }

    // ► Student nach ID finden
    public Student findStudentById(int id) {
        for (Student student : studentenListe) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        System.out.println("Kein Student mit der ID " + id + " gefunden.");
        return null;
    }

    // ► Student nach ID löschen
    public String deleteStudentById(int id) {
        for (Student student : studentenListe) {
            if (student.getStudentId() == id) {
                studentenListe.remove(student);
                return "Student mit ID " + id + " wurde entfernt.";
            }
        }
        return "Student mit ID " + id + " wurde nicht gefunden.";
    }
}
