package com.example.Esercizi.ingsw.Esercizio7;



public class Contatore<T> {
    private Class<T> tipo;

    public Contatore(Class<T> tipo) {
        this.tipo = tipo;
    }

    public int count(Object[] array) {
        int counter = 0;
        for (Object elem : array) {
            if (tipo.isInstance(elem)) {
                counter++;
            }
        }
        return counter;
    }
}

