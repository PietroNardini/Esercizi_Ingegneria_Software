package org.Esercizio6;

public abstract class MetodoPagamento {
        double saldoDisponibile;
        public MetodoPagamento(double saldoDisponibile){
            this.saldoDisponibile = saldoDisponibile;
        }   
        public void riceviPagamento(double importo){
            saldoDisponibile += importo;
        }
        public void effettuaPagamento(double importo) throws Exception {
            if (importo > saldoDisponibile) {
                throw new Exception("Saldo insufficiente");
            }
            saldoDisponibile -= importo;
        }
}
