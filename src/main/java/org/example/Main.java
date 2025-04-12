package org.example;

import java.math.BigDecimal;
import java.time.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produkt cukier = new Produkt("cukier", 10.6);
        Produkt bialko = new Produkt("bialko", 0.07);
        Produkt tluszcze = new Produkt("tluszcze", 0);

        Etykieta etykieta = new Etykieta.Builder("Coca-cola", 500, List.of(cukier, bialko, tluszcze), new BigDecimal("5.0"))
                .setKrajPochodzenia("USA")
                .setNumerPartii("P-20250412-001")
                .setDataWaznosci(LocalDateTime.of(LocalDate.now().plusYears(2), LocalTime.now()))
                .build();
    }
}