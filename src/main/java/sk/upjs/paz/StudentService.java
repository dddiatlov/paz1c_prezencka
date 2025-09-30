package sk.upjs.paz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentService {
    private List<Student> studenti;
    public StudentService(List<Student> students) {
        this.studenti = new ArrayList<>(students);
    }

    public double podielChlapcov() {
        int podiel = 0;
        for (Student s : studenti) {
            if (s.pohlavie() == Sex.MALE) {
                podiel++;
            }
        }
        return (double) podiel / studenti.size();
    }
}
