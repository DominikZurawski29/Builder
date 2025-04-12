package org.example;

public class Produkt {

    private String name;

    private double quantity;

    public Produkt(String name, double quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
