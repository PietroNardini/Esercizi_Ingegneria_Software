package com.example.Esercizi.ingsw.Esercizio3;

public class Cerchio extends Forma{
        private double raggio;
        public Cerchio(double raggio){
            this.raggio=raggio;
        }
        public double area(){
            return raggio*2*Math.PI;
        }
}
