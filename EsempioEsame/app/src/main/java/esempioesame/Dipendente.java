package main.java.esempioesame;
import main.java.esempioesame.*;
public abstract class Dipendente implements Lavoratore, Pagabile{
    String nome;
    public Dipendente(String nome){
        this.nome = nome;
    }
    public abstract String getNome();

}
