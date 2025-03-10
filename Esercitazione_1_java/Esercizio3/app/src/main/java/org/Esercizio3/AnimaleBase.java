package org.Esercizio3;

public class AnimaleBase implements Animale {
    private String nome;

    public AnimaleBase(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Verso generico");
    }

    @Override
    public void muoviti() {
        System.out.println("Movimento generico");
    }

}
