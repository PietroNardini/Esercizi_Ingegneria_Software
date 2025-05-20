package com.example.Esercizi.ingsw.esercizio25;

public class ContoRisparmio extends ContoBancario{
        public ContoRisparmio(String intestatario, double saldo) {
            super(intestatario, saldo);
        }

        @Override
        public double calcolaInteresse() {
            return saldo * 0.03; // 3% interesse
        }
}
