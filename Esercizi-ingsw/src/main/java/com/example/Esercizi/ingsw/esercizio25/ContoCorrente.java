package com.example.Esercizi.ingsw.esercizio25;

public class ContoCorrente extends ContoBancario{
        public ContoCorrente(String intestatario, double saldo) {
            super(intestatario, saldo);
        }

        @Override
        public double calcolaInteresse() {
            return saldo * 0.01; // 1% interesse
        }
}
