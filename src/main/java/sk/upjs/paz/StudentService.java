package sk.upjs.paz;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private List<Student> studenti;
    public StudentService(List<Student> students) {
        this.studenti = new ArrayList<>(students);
    }

    public double podielChlapcov() {
        int podiel = 0;
        for (Student s : studenti) {
            if (s.pohlavie() == Sex.M) {
                podiel++;
            }
        }
        return (double) podiel / studenti.size();
    }

    public static List<Student> loadStudents(String filename) throws IOException {
        try (InputStream stream = StudentService.class.getResourceAsStream(filename)) {
            List<Student> students = new ArrayList<>();
            Scanner scanner = new Scanner(stream);

            // pass first line, because it's a header of the table
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                students.add(new Student(
                        Long.getLong(data[2]),
                        data[0],
                        data[1],
                        Sex.valueOf(data[3]),
                        LocalDate.parse(data[4]))
                );
                System.out.println(line);
            }

            return students;
        } catch (IOException e) {
            System.err.println("file not found: " + e.getMessage());
            return null;
        }
    }
}
