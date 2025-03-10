package org.Esercizio4;

public class Manager extends Dipendente {
    private double bonus;

    public Manager(String nome, double stipendio, double bonus) {
        super(nome, stipendio);
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
