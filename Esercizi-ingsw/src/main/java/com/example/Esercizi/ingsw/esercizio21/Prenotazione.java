package com.example.Esercizi.ingsw.esercizio21;

public class Prenotazione {
    private Sala sala;
    private Film film;
    private int postiPrenotati;

    public Prenotazione(Sala sala, Film film, int postiPrenotati) {
        this.sala = sala;
        this.film = film;
        this.postiPrenotati = postiPrenotati;
    }

    public Sala getSala() {
        return sala;
    }

    public Film getFilm() {
        return film;
    }
    @Override
        public String toString() {
            return "Prenotazione: Film \"" + film.getTitolo() + "\", Sala \"" + sala.getNome() + "\", posti: " + postiPrenotati;
    }
}
