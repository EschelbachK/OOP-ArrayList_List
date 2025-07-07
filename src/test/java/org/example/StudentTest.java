package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructorAndGetters_shouldReturnCorrectValues() {
        // Student anlegen
        Student student = new Student("Max", "Mustermann", 123);

        // Getter prüfen
        assertEquals("Max", student.getVorname());
        assertEquals("Mustermann", student.getNachname());
        assertEquals(123, student.getStudentId());
    }

    @Test
    void toString_shouldContainAllFields() {
        // Student anlegen
        Student student = new Student("Anna", "Müller", 456);

        // Ausgabe als String erzeugen
        String str = student.toString();

        // Prüfen, dass Vorname, Nachname und ID enthalten sind
        assertTrue(str.contains("Anna"));
        assertTrue(str.contains("Müller"));
        assertTrue(str.contains("456"));
    }
}
