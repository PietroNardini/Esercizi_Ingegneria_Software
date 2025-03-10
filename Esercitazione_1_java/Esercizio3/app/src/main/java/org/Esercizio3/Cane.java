package org.Esercizio3;

public class Cane extends AnimaleBase {
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println("Bau");
    }

    @Override
    public void muoviti() {
        System.out.println("il cane si muove");
    }
}
