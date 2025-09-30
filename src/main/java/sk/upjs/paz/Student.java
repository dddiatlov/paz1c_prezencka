package sk.upjs.paz;

import lombok.With;

import java.time.LocalDate;

@With
public record Student(Long id, String meno , String priezvisko,Sex pohlavie, LocalDate datum) {
}
