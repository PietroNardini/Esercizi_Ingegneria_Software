package org.Esercizio2;

public class Libro extends MaterialeBibliotecario {
    String autore;
    public Libro(String titolo, String annoPubblicazione,String autore){
        super(titolo,annoPubblicazione);
        this.autore =autore;
    }
    public Libro(String titolo, String annoPubblicazione){
        super(titolo,annoPubblicazione);
        this.autore="Autore Sconosciuto";
    }
    public Libro(String titolo){
        super(titolo,"Anno Sconosciuto");
        this.autore="Autore Sconosciuto";
    }
    public String toString() {
        return "autore: " + autore + " titolo: " + titolo + " annoPubblicazione: " + annoPubblicazione;
    }   
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return this.titolo.equals(libro.titolo) && this.annoPubblicazione.equals(libro.annoPubblicazione) && this.autore.equals(libro.autore);
    }
}
