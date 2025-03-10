package org.Esercizio1;

public class Moto extends MezzoDiTrasporto {
        public Moto(String targa){
            super(targa);;
        }
        @Override
        public void avvia(){
             if(this.stato.equals("fermo")){
                this.stato = "avviato";
                System.out.println("La moto con targa "+this.targa+" è stata avviata");    
            }
            else{
                System.out.println("la moto di trasporto è già avviato");
            }    
        }
        public void ferma(){
                if(this.stato.equals("avviato")){
                    this.stato = "fermo";
                    System.out.println("La moto con targa "+this.targa+" è stata fermata");    
                }
                else{
                    System.out.println("la moto di trasporto è già ferma");
                }
                
        
                
        }
       

}
