package com.example.Esercizi.ingsw.Esercizio11;

public class Prodotto {
private String nome;
    private String codice;
    private double prezzo;

    // Costruttore
    public Prodotto(String nome, String codice, double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.prezzo = prezzo;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo toString per stampare le informazioni del prodotto
    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", codice='" + codice + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
