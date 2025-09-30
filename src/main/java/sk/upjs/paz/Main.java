package sk.upjs.paz;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("zzzzzz");

        var student = new Student(1L, "Jan", "Mrkva", Sex.MALE, LocalDate.of(2005, 9, 30));

        student = new Student(student.id(), student.meno(), student.priezvisko(), student.pohlavie(), student.datum());
    }
}