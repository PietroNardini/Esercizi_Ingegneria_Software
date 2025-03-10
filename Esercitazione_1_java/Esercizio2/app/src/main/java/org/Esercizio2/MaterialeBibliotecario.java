package org.Esercizio2;

public abstract class MaterialeBibliotecario {
        String titolo;
        String annoPubblicazione;
        public MaterialeBibliotecario(String titolo, String annoPubblicazione) {
            this.titolo = titolo;
            this.annoPubblicazione = annoPubblicazione;
        }
        public String getTitolo() {
            return titolo;
        }
        public String getAnnoPubblicazione() {
            return annoPubblicazione;
        }
}
