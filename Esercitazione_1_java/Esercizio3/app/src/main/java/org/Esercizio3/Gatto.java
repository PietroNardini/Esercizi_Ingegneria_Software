package org.Esercizio3;

public class Gatto extends AnimaleBase {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println("Miao");
    }

    @Override
    public void muoviti() {
        System.out.println("il gatto si muove");
    }
}
