package org.Esercizio1;

public abstract class MezzoDiTrasporto implements Veicolo {
        public String targa;
        public String stato;
        public MezzoDiTrasporto(String targa){
                this.targa = targa;
                this.stato="fermo";
        }
        public String getTarga(){
                return this.targa;
        }
        public String getStato(){
                return this.stato;
        }
        public void avvia(){
                if(this.stato.equals("fermo")){
                    this.stato = "avviato";
                    System.out.println("Il mezzo di trasporto è stato avviato");  
                }
                else{
                    System.out.println("Il mezzo di trasporto è già avviato");
                }
        }
        public void ferma(){
                if(this.stato.equals("avviato")){
                    this.stato = "fermo";
                    System.out.println("Il mezzo di trasporto è stato fermato");  
                }
                else{
                    System.out.println("Il mezzo di trasporto è già fermo");
                }
                
        }
        public String getTipo(){
                return this.getClass().getSimpleName();
        }
}
