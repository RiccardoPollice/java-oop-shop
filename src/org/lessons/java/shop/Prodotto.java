package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;
    //COSTRUTTORI
    public Prodotto( String name, String description, double price) {
        Random randomCode = new Random();
        this.code = randomCode.nextInt(1, 10001);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = priceIva;
    }
    //GET AND SET
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public double getIva() {
        double priceIva = price * 1.22;
        return priceIva;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    //MODULI
    Random randomCodice = new Random();
    public int codiceProdotto = randomCodice.nextInt(1000000,99999999);
    public double priceIva = price * 1.22;
}