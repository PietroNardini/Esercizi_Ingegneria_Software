package com.example.Esercizi.ingsw.esercizio23;

public class Visita {
    private Paziente paziente;
    private Medico medico;
    private String data;
    private String motivo;

    public Visita(Paziente paziente, Medico medico, String data, String motivo) {
        this.paziente = paziente;
        this.medico = medico;
        this.data = data;
        this.motivo = motivo;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public String getDettagli() {
        return "Data: " + data +
               ", Medico: " + medico.getNome() + " (" + medico.getSpecializzazione() + ")" +
               ", Motivo: " + motivo;
    }
}
