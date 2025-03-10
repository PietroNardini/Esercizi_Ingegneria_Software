/*
Esercizio 3: Gestione Animali (Ereditarietà e Interfacce)
Crea un programma che modella diversi animali e le loro caratteristiche.
Requisiti:
Crea un'interfaccia Animale con i metodi emettiVerso() e muoviti().
Crea una classe astratta AnimaleBase che implementa Animale e ha un attributo nome.
Implementa due classi concrete Cane e Gatto, che ereditano da AnimaleBase.
Utilizza un array o una lista per memorizzare diversi animali e farli interagire.
 */
package org.Esercizio3;

public class App {
    
    public static void main(String[] args) {
        Animale[] animali = new Animale[3];
        animali[0] = new Cane("Cane1");
        animali[1] = new Cane("Cane2");
        animali[2] = new Gatto("Gatto1");
        animali[0].emettiVerso();
        animali[2].emettiVerso();
        animali[1].muoviti();

        }
}
