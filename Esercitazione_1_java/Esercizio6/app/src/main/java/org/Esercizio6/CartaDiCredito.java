package org.Esercizio6;

public class CartaDiCredito extends MetodoPagamento {
    
    public String numeroCarta;
    public CartaDiCredito(double saldoDisponibile,String numeroCarta) {
        super(saldoDisponibile);
        this.numeroCarta = numeroCarta;
    }
    @Override
    public String toString(){
        return "Carta di credito: "+numeroCarta +" Saldo: "+saldoDisponibile;
    }
}
