package org.Esercizio6;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamenti implements Pagabile{
    List<MetodoPagamento> metodiPagamento;
    public SistemaPagamenti(List<MetodoPagamento> metodiPagamento){
        this.metodiPagamento = metodiPagamento;
    }
    public SistemaPagamenti(){
        metodiPagamento=new ArrayList<>();
    }
    public void aggiungiMetodoPagamento(MetodoPagamento metodoPagamento){
        metodiPagamento.add(metodoPagamento);
    }
    public void effettuaPagamento(double importo) throws Exception {
        for (MetodoPagamento metodoPagamento : metodiPagamento) {
            metodoPagamento.effettuaPagamento(importo);
        }
    }
    public void VisualizzaMetodi(){
        for (MetodoPagamento metodoPagamento : metodiPagamento) {
            System.out.println(metodoPagamento.toString());
        }
    }

}
