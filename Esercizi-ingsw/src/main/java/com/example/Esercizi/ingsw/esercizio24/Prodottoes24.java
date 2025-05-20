package com.example.Esercizi.ingsw.esercizio24;

public class Prodottoes24 {
        private String nome;
        private double prezzo;
        private boolean disponibile;

        public Prodottoes24(String nome, double prezzo, boolean disponibile) {
            this.nome = nome;
            this.prezzo = prezzo;
            this.disponibile = disponibile;
        }

        public String getNome() {
            return nome;
        }

        public double getPrezzo() {
            return prezzo;
        }

        public boolean isDisponibile() {
            return disponibile;
        }

        @Override
        public String toString() {
            return nome + " - " + prezzo + " - " + (disponibile ? "Disponibile" : "Non disponibile");
        }
}
