package com.example.Esercizi.ingsw.Esercizio3;

public class Rettangolo extends Forma{
        private double base;
        private double altezza;
        public Rettangolo(double base,double altezza){
            this.base=base;
            this.altezza=altezza;
        }
        public double area(){
            return this.base*this.altezza;
        }
}
