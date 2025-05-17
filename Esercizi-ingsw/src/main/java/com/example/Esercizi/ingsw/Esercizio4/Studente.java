package com.example.Esercizi.ingsw.Esercizio4;

public class Studente {
    private String nome;
    private String matricola;
    private double[] voti;
    public Studente(String nome,String matricola, double[] voti){
        this.nome=nome;
        this.matricola=matricola;
        this.voti=voti;
    }
    public String getNome(){
        return this.nome;
    }
    public double getMediaVoti(){
        double acc=0;
        if(voti.length==0){
            return 0;
        }
        for(double voto: voti){
            acc+=voto;
        }
        return acc/voti.length;
    }
}
