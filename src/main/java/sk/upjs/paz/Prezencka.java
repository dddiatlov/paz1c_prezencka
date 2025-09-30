package sk.upjs.paz;

import lombok.With;

import java.time.LocalDateTime;
import java.util.List;

@With
public record Prezencka(Long id, LocalDateTime datum, Predmet predmet, List<Student> studenti) {
}
