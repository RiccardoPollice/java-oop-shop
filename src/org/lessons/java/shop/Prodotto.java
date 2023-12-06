package org.lessons.java.shop;

public class Prodotto {
    // Attributi
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttori
    public Prodotto( String nome, String descrizione, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = prezzoIva;
    }
    //Getter e Setter
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public double getIva() {
        double priceIva = prezzo * 1.22;
        return priceIva;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    //Moduli

    public double prezzoIva = prezzo * 1.22;

}
