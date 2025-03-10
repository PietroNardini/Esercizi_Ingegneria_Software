package org.Esercizio5;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioni implements Prenotabile{
        List <Viaggio> viaggi;
        public SistemaPrenotazioni(){
            viaggi=new ArrayList<>();
        }
        public void prenota(){
            for(Viaggio v:viaggi){
                v.prenota();
            }
        }
        public void printViaggi(){
            for(Viaggio v:viaggi){
                v.descrizione();
            }
        }

}
