package sk.upjs.paz;

import java.util.List;

public record Predmet(Long id, String nazov, int rocnik, List<Student> studenti ) {

}
