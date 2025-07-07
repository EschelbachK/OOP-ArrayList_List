package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    // Instanz der zu testenden Klasse
    private School school;

    // Beispielstudenten
    private Student student1;
    private Student student2;

    @BeforeEach
    void setUp() {
        // Neue School‑Instanz
        school = new School();

        // Zwei Studenten (Vorname, Nachname, ID)
        student1 = new Student("Max", "Mustermann", 1);
        student2 = new Student("Anna", "Müller", 2);
    }

    @Test
    void addStudent_whenStudentAdded_thenCanFindById() {
        // Student hinzufügen
        school.addStudent(student1);
        // Student per ID finden
        assertEquals(student1, school.findStudentById(1));
    }

    @Test
    void showAllStudents_whenListIsEmpty_thenDoesNotThrow() {
        // Erwartet keine Exception beim Aufruf mit leerer Liste
        assertDoesNotThrow(() -> school.showAllStudents());
    }

    @Test
    void showAllStudents_whenStudentsPresent_thenDoesNotThrow() {
        // Zwei Studenten hinzufügen
        school.addStudent(student1);
        school.addStudent(student2);
        // ► Erwartet keine Exception beim Aufruf
        assertDoesNotThrow(() -> school.showAllStudents());
    }

    @Test
    void findStudentById_whenIdExists_thenReturnsStudent() {
        // Student hinzufügen
        school.addStudent(student1);
        // Student mit ID 1 suchen
        Student result = school.findStudentById(1);
        assertNotNull(result);
        assertEquals("Max", result.getVorname());
    }

    @Test
    void findStudentById_whenIdDoesNotExist_thenReturnsNull() {
        // Nicht vorhandene ID suchen
        assertNull(school.findStudentById(999));
    }

    @Test
    void deleteStudentById_whenIdExists_thenRemovesStudentAndReturnsSuccessMessage() {
        // Student hinzufügen
        school.addStudent(student1);
        // Student löschen
        String message = school.deleteStudentById(1);
        assertEquals("Student mit ID 1 wurde entfernt.", message);
        // Sicherstellen, dass Student entfernt wurde
        assertNull(school.findStudentById(1));
    }

    @Test
    void deleteStudentById_whenIdDoesNotExist_thenReturnsErrorMessage() {
        // Fehlversuch einen nicht vorhandenen Studenten zu löschen
        String message = school.deleteStudentById(999);
        assertEquals("Student mit ID 999 wurde nicht gefunden.", message);
    }
}
