package com.example.Esercizi.ingsw.esercizio27;

public class PersonaJson {
        String nome;
        int eta;

        public PersonaJson(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Età: " + eta;
        }
    }