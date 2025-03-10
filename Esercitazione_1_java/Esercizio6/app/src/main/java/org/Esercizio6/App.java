/*
Creiamo un sistema che gestisce pagamenti con diversi metodi.
Requisiti:
Crea un'interfaccia Pagabile con un metodo effettuaPagamento(double importo).
Crea una classe astratta MetodoPagamento con attributi saldoDisponibile.
Implementa le classi CartaDiCredito e PayPal, con comportamenti specifici per i pagamenti.
Aggiungi una classe SistemaPagamenti che gestisce una lista di metodi di pagamento.
Implementa eccezioni personalizzate per gestire il saldo insufficiente.

 */
package org.Esercizio6;

public class App {
  

    public static void main(String[] args) {
            SistemaPagamenti sistemaPagamenti = new SistemaPagamenti();
            CartaDiCredito cartaDiCredito = new CartaDiCredito(1000,"123456789");
            Paypal payPal = new Paypal(500,"email@gmail.com");
            sistemaPagamenti.aggiungiMetodoPagamento(cartaDiCredito);
            sistemaPagamenti.aggiungiMetodoPagamento(payPal);
            try {
                sistemaPagamenti.effettuaPagamento(1002);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            sistemaPagamenti.VisualizzaMetodi();
    }
}
