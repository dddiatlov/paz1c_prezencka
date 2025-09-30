package sk.upjs.paz;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.Test
    void testPodielChlapcov() {
        // create 3 students
        var students = List.of(
                new Student(1L, "Mrkva", "Dlha", Sex.MALE, LocalDate.of(2007, 12, 4)),
                new Student(1L, "Mrkva1", "Dlha1", Sex.MALE, LocalDate.of(2007, 12, 4)),
                new Student(1L, "Mrkva2", "Dlha2", Sex.FEMALE, LocalDate.of(2007, 12, 4))
        );

        var service = new StudentService(students);

        assertEquals(2.0/3.0, service.podielChlapcov());
    }
}