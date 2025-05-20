package main.java.esempioesame;
import main.java.esempioesame.*;

public class Manager extends Dipendente{
    private String mobile;
    public Manager(String nome, String mobile){
        super(nome);
        this.mobile = mobile;
    }

    @Override
    public void lavora(){
        System.out.println("Manager Lavora");
    }

    @Override
    public double calcolaPaga() {
        System.out.println("Calcolo paga ....");
        return 3000;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}