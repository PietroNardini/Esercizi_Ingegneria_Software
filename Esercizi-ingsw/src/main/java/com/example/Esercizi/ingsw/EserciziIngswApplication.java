package com.example.Esercizi.ingsw;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Esercizi.ingsw.Esercizio3.Cerchio;
import com.example.Esercizi.ingsw.Esercizio3.Forma;
import com.example.Esercizi.ingsw.Esercizio3.Rettangolo;
import com.example.Esercizi.ingsw.Esercizio4.Studente;

@SpringBootApplication
public class EserciziIngswApplication {

	public static void main(String[] args) {
		/*
		ESERCIZIO 2
		Somma da Input (args + array)
			Nel main(String[] args), prendi una serie di numeri interi da riga di comando e stampa
			la loro somma. 
		*/
		int acc=0;
		try{
				for(String elem:args){
					acc+=Integer.parseInt(elem);
				}
		}
		catch(NumberFormatException e){
			System.out.println("Non tutti i parametri sono numeri interi");
		}
		System.out.println("Somma numeri interi = "+acc);
		/*
		ESERCIZIO 3
		Forma Astratta (Classi astratte + ereditarietà)
			Crea una classe astratta Forma con metodo astratto double area().
			Implementa Cerchio e Rettangolo, e nel main crea un array di forme e stampa l’area di
			ciascuna.
		*/
		List<Forma> forme=new ArrayList<>();
		forme.add(new Rettangolo(10, 2));
		forme.add(new Cerchio(2.5));
		for(Forma f :forme){
			System.out.println("Area del "+f.getClass().getSimpleName()+" = "+f.area());
		}
		/*
		ESERCIZIO 4
		Registro Studenti (ArrayList + Classi)
		Crea una classe Studente con nome, matricola, voti[].
		Nel main, aggiungi studenti a un ArrayList, calcola e stampa la media voti.
		*/
		List<Studente> studenti=new ArrayList<>();
		studenti.add(new Studente("Pietro","158187",new double[]{9.5,10,2,3}));
		studenti.add(new Studente("Pietr2","158188",new double[]{7.5,5,2,5}));
		for(Studente s:studenti){
			System.out.println("Media dello studente "+s.getNome()+ " = "+s.getMediaVoti());
		}
	}

}
