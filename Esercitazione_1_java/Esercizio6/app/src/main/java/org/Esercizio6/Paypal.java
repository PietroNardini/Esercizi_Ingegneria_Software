package org.Esercizio6;

public class Paypal extends MetodoPagamento{
        public String Email;
        public Paypal(double saldoDisponibile,String Email) {
            super(saldoDisponibile);
            this.Email=Email;
        }
        @Override
        public String toString(){
            return "Email Paypal: "+Email +" Saldo: "+saldoDisponibile;
        }

}
