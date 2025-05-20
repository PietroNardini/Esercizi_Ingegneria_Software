package com.example.Esercizi.ingsw.esercizio24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo <T>{
        private List<T> elementi = new ArrayList<>();

        public void aggiungi(T elemento) {
            elementi.add(elemento);
        }

        public List<T> filtra(Predicate<T> filtro) {//filtro tramite un predicato( Es i -> (i < 18))
            List<T> risultato = new ArrayList<>();
            for (T e : elementi) {
                if (filtro.test(e)) {
                    risultato.add(e);
                }
            }
            return risultato;
        }

        public List<T> getTutti() {
            return elementi;
        }
}
