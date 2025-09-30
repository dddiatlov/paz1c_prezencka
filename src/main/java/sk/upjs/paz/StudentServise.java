package sk.upjs.paz;

import java.util.ArrayList;
import java.util.List;

public class StudentServise {
    private List<Student> studenti;
    public StudentServise(List<Student> student) {

        this.studenti = new ArrayList<Student>(student);
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
