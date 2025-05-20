package com.example.Esercizi.ingsw.esercizio25;

public abstract class ContoBancario {
        protected String intestatario;
        protected double saldo;

        public ContoBancario(String intestatario, double saldo) {
            this.intestatario = intestatario;
            this.saldo = saldo;
        }

        public abstract double calcolaInteresse();

        @Override
        public String toString() {
            return intestatario + " - Saldo: " + saldo + "$ - Interesse: €" + calcolaInteresse();
        }
}
