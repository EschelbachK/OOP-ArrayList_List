package org.example;

public class Main {
    public static void main(String[] args) {

        // ► Schule-Instanz anlegen
        School schule = new School();

        // ► Studenten anlegen
        Student student1 = new Student("Frank", "Schmitt", 5);
        Student student2 = new Student("Jack", "Müller", 3);
        Student student3 = new Student("Hans", "Meier", 2);

        // ► In die Schule aufnehmen
        schule.addStudent(student1);
        schule.addStudent(student2);
        schule.addStudent(student3);

        System.out.println();

        // ► Alle Studenten ausgeben
        System.out.println("Studentenliste:");
        schule.showAllStudents();

        System.out.println();

        System.out.println("Student finden, nach ID:");
        System.out.println(schule.findStudentById(5));

        System.out.println();

        System.out.println("Vor dem Löschen:");
        schule.showAllStudents();

        System.out.println();

        System.out.println(schule.deleteStudentById(3));

        System.out.println();

        System.out.println("Nach dem Löschen:");
        schule.showAllStudents();
    }
}

