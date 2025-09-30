package sk.upjs.paz;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiseTest {
    @org.junit.jupiter.api.BeforeEach
    void setUP() {

    }

    @Test
    void testPodielChlapcov() {
        var students = List.of(
                new Student(1L, "Karl", "Packa", Sex.MALE, LocalDate.of(2003, 7, 21)),
                new Student(1L, "Mark", "janukovich", Sex.MALE, LocalDate.of(2003, 1, 21)),
                new Student(1L, "Sasha", "Poroshenko", Sex.FEMALE, LocalDate.of(2003, 5, 21))
        );

        StudentServise studentServise = new StudentServise(students);
        var got = studentServise.podielChlapcov();
        var expected = 2.0/3;
        assertEquals(expected, got);

    }

}