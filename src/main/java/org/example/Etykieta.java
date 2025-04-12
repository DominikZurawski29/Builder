package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Etykieta {
    private final String nazwaProduktu;

    private final int objetosc;

    private final LocalDateTime dataWaznosci;
    private final String numerPartii;
    private final List<Produkt> skladniki;
    private final BigDecimal cena;
    private final String krajPochodzenia;
    private Etykieta(Builder builder) {
        nazwaProduktu = builder.nazwaProduktu;
        objetosc = builder.objetosc;
        dataWaznosci = builder.dataWaznosci;
        numerPartii = builder.numerPartii;
        skladniki = builder.skladniki;
        cena = builder.cena;
        krajPochodzenia = builder.krajPochodzenia;
    }

    public static class Builder{

        private final String nazwaProduktu;
        private final int objetosc;
        private final List<Produkt> skladniki;
        private final BigDecimal cena;
        private LocalDateTime dataWaznosci = null;

        private String numerPartii = null;
        private String krajPochodzenia = null;
        public Builder(String nazwaProduktu, int objetosc, List<Produkt> skladniki, BigDecimal cena) {
            this.nazwaProduktu = nazwaProduktu;
            this.objetosc = objetosc;
            this.skladniki = skladniki;
            this.cena = cena;
        }

        public Builder setDataWaznosci(LocalDateTime dataWaznosci) {
            this.dataWaznosci = dataWaznosci;
            return this;
        }

        public Builder setNumerPartii(String numerPartii) {
            this.numerPartii = numerPartii;
            return this;
        }

        public Builder setKrajPochodzenia(String krajPochodzenia) {
            this.krajPochodzenia = krajPochodzenia;
            return this;
        }

        public Etykieta build(){
            return new Etykieta(this);
        }
    }

    @Override
    public String toString() {
        return "Etykieta{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", objetosc=" + objetosc +
                ", dataWaznosci=" + dataWaznosci +
                ", numerPartii='" + numerPartii + '\'' +
                ", skladniki=" + skladniki +
                ", cena=" + cena +
                ", krajPochodzenia='" + krajPochodzenia + '\'' +
                '}';
    }
}
