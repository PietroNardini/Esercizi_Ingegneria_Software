package com.example.Esercizi.ingsw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Esercizi.ingsw.Esercizio11.Prodotto;
import com.example.Esercizi.ingsw.Esercizio13.Auto;
import com.example.Esercizi.ingsw.Esercizio13.Macchina;
import com.example.Esercizi.ingsw.Esercizio13.Moto;
import com.example.Esercizi.ingsw.Esercizio3.Cerchio;
import com.example.Esercizi.ingsw.Esercizio3.Forma;
import com.example.Esercizi.ingsw.Esercizio3.Rettangolo;
import com.example.Esercizi.ingsw.Esercizio4.Studente;
import com.example.Esercizi.ingsw.Esercizio6.Animale;
import com.example.Esercizi.ingsw.Esercizio6.Cane;
import com.example.Esercizi.ingsw.Esercizio6.Gatto;
import com.example.Esercizi.ingsw.Esercizio7.Contatore;
import com.example.Esercizi.ingsw.Esercizio8.Squadra;
import com.example.Esercizi.ingsw.Esercizio9.Persona;
import com.example.Esercizi.ingsw.esercizio15.Libro;
import com.example.Esercizi.ingsw.esercizio19.Abbonamento;
import com.example.Esercizi.ingsw.esercizio19.Fattura;
import com.example.Esercizi.ingsw.esercizio19.Pagabile;
import com.example.Esercizi.ingsw.esercizio20.VoceDiario;
import com.example.Esercizi.ingsw.esercizio21.Film;
import com.example.Esercizi.ingsw.esercizio21.Prenotazione;
import com.example.Esercizi.ingsw.esercizio21.Sala;

@SpringBootApplication
public class EserciziIngswApplication {
	/*
		ESERCIZIO 2
		Somma da Input (args + array)
			Nel main(String[] args), prendi una serie di numeri interi da riga di comando e stampa
			la loro somma. 
		*/
		public static void esercizio2(String[] args){
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
		}
		/*
		ESERCIZIO 3
		Forma Astratta (Classi astratte + ereditarietà)
			Crea una classe astratta Forma con metodo astratto double area().
			Implementa Cerchio e Rettangolo, e nel main crea un array di forme e stampa l’area di
			ciascuna.
		*/
		public static void esercizio3(){
			List<Forma> forme=new ArrayList<>();
			forme.add(new Rettangolo(10, 2));
			forme.add(new Cerchio(2.5));
			for(Forma f :forme){
				System.out.println("Area del "+f.getClass().getSimpleName()+" = "+f.area());
			}
		}
		/*
		ESERCIZIO 4
		Registro Studenti (ArrayList + Classi)
		Crea una classe Studente con nome, matricola, voti[].
		Nel main, aggiungi studenti a un ArrayList, calcola e stampa la media voti.
		*/
		public static void esercizio4(){
				List<Studente> studenti=new ArrayList<>();
				studenti.add(new Studente("Pietro","158187",new double[]{9.5,10,2,3}));
				studenti.add(new Studente("Pietr2","158188",new double[]{7.5,5,2,5}));
				for(Studente s:studenti){
					System.out.println("Media dello studente "+s.getNome()+ " = "+s.getMediaVoti());
				}
		}
		/*
		ESERCIZIO 5
		 	Filtro Numeri Pari (Array + if)
			Nel main, dichiara un array di interi. Stampa solo i numeri pari usando un ciclo.
		*/
		public static void esercizio5(){
				int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
				for(int i:array){
					if(i%2==0){
						System.out.println(i);
					}
				}
		}
		/*
		ESERCIZIO6
		Interfaccia Animale (Interfacce + Ereditarietà)
			Crea un'interfaccia Animale con metodo verso().
			Implementa Cane e Gatto. Nel main, chiama il verso su una lista di animali.
		*/
		public static void esercizio6(){
			List<Animale> animali=new ArrayList<>();
						animali.add(new Cane());
						animali.add(new Gatto());
						for(Animale a :animali){
							a.verso();
			}
		}
		/*
		ESERCIZIO 7 
		Contatore Generico (Generics)
			Crea una classe Contatore<T> che conta elementi di tipo T.
			Nel main, conta quanti numeri e quante stringhe ci sono in due array diversi.
		 */
		public static void esercizio7(){
				Object[] numeri = {1, "test", 2, 3.5, 4};
				Object[] parole = {"ciao", 123, "mondo", "java"};

				Contatore<Integer> contatoreNumeri = new Contatore<>(Integer.class);
				Contatore<String> contatoreStringhe = new Contatore<>(String.class);

				System.out.println("Numeri interi trovati: " + contatoreNumeri.count(numeri));
				System.out.println("Stringhe trovate: " + contatoreStringhe.count(parole));	
		}
		/*
		ESERCIZIO 8
		Classifica Sportiva (ArrayList + Sorting)
		Crea una classe Squadra con nome e punti.
		Nel main, aggiungi squadre a una lista e ordinale in base ai punti.
		 */
		public static void esercizio8(){
			ArrayList<Squadra> classifica = new ArrayList<>();

			classifica.add(new Squadra("Tigri", 42));
			classifica.add(new Squadra("Leoni", 35));
			classifica.add(new Squadra("Pantere", 48));
			classifica.add(new Squadra("Gufi", 29));

			Collections.sort(classifica);

			System.out.println("Classifica finale:");
			for (Squadra s : classifica) {
				System.out.println(s);
			}
		}
	/*
		ESERCIZIO 9
		Incapsulamento Base (get/set)
		Crea una classe Persona con nome e età privati.
		Nel main, crea una persona e modifica i dati con i metodi pubblici. 
		*/
		public static void esercizio9(){
				Persona p=new Persona();
				p.setNome("Pietro");
				p.setEtà(15);
				System.out.println(p.getEtà());
				System.out.println(p.getNome());
		}
	/*
	 * ESERCIZIO 10
	 * Calcolatrice con switch (args)
		Usa args per ricevere due numeri e un'operazione (+, -, *, /).
		Stampa il risultato.
	 */
	public static void esercizio10(String[] args){
		for(String x:args){
			System.out.println(x);
		}
		if (args.length != 3) {
            System.out.println("Utilizzo: java Calcolatrice <numero1> <operatore> <numero2>");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            String operatore = args[1];
            double num2 = Double.parseDouble(args[2]);

            double risultato;

            switch (operatore) {
                case "+":
                    risultato = num1 + num2;
                    break;
                case "-":
                    risultato = num1 - num2;
                    break;
                case "x":
                    risultato = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Errore: divisione per zero.");
                        return;
                    }
                    risultato = num1 / num2;
                    break;
                default:
                    System.out.println("Operatore non valido. Usa +, -, x o /");
                    return;
            }

            System.out.println("Risultato: " + risultato);

        } catch (NumberFormatException e) {
            System.out.println("Errore: inserisci numeri validi.");
        }
	}
	/*
	ESERCIZIO 11
	 * Magazzino Prodotti (ArrayList + Ricerca)
			Crea una classe Prodotto con nome, codice, prezzo.
			Nel main, cerca un prodotto per codice tra quelli inseriti in un ArrayList.
	 */
	public static void esercizio11(){
		ArrayList<Prodotto> prodotti = new ArrayList<>();

		prodotti.add(new Prodotto("Laptop", "ABC123", 899.99));
        prodotti.add(new Prodotto("Smartphone", "XYZ789", 499.50));
        prodotti.add(new Prodotto("Tablet", "TAB456", 299.00));

        // Codice prodotto da cercare
        String codiceDaCercare = "XYZ789";
		Prodotto trovato=null;
        // Cerca prodotto per codice
		for (Prodotto p : prodotti) {
            if (p.getCodice().equalsIgnoreCase(codiceDaCercare)) {
                 trovato= p;
				
            }
        }
        if (trovato != null) {
            System.out.println("Prodotto trovato: " + trovato);
        } else {
            System.out.println("Prodotto con codice " + codiceDaCercare + " non trovato.");
        }
	}
	/*ESERCIZIO 12 
	 * Registro Presenze (Array 2D)
		Gestisci un array bidimensionale per tracciare le presenze di studenti in una settimana.
		Nel main, stampa le presenze totali per ogni studente.
	*/
	public static void esercizio12(){
		int[][] presenze = {
            {1, 1, 0, 1, 1}, // studente 0
            {1, 0, 1, 1, 0}, // studente 1
            {1, 1, 1, 1, 1}, // studente 2
            {0, 1, 0, 0, 1}  // studente 3
        };

        for (int i = 0; i < presenze.length; i++) {
            int totali = 0;
            for (int j = 0; j < presenze[i].length; j++) {
                totali += presenze[i][j];
            }
            System.out.println("Studente " + i + ": " + totali + " presenze");
        }
	}
	/*ESERCIZIO 13
	 * Macchina Astratta (Classe Astratta + Overriding)
		Crea una classe astratta Macchina con metodo avvia().
		Implementa Auto e Moto. Nel main, chiama avvia() su entrambe.
	 */
	public static void esercizio13(){
		Macchina a=new Auto();
		Macchina m=new Moto();
		a.Avvia();
		m.Avvia();

	}
	/*
	 * ESERCIZIO 14
	 * Parole Lunghe (Array + Condizioni)
		Nel main, prendi da args una lista di parole.
		Stampa solo quelle più lunghe di 5 lettere.
	 */
	public static void esercizio14(String[] args){
		for(String s: args){
			if(s.length()>5){
				System.out.println(s);
			}
		}
	}
			// 15. Biblioteca (ArrayList + Oggetti)
		// Crea una classe Libro con titolo, autore, anno.
		// Nel main, inserisci e stampa una lista di libri in una ArrayList.
		public static void esercizio15() {
			ArrayList<Libro> biblioteca = new ArrayList<>();
			biblioteca.add(new Libro("Il nome della rosa", "Umberto Eco", 1980));
			biblioteca.add(new Libro("1984", "George Orwell", 1949));
			biblioteca.add(new Libro("Il piccolo principe", "Antoine de Saint-Exupéry", 1943));

			System.out.println("Lista dei libri in biblioteca:");
			for (Libro libro : biblioteca) {
				System.out.println(libro);
			}
		}

		// 16. Stack Generico (Generics + ArrayList)
		// Crea una classe Stack<T> con metodi push, pop, peek.
		// Nel main, crea uno stack di stringhe e prova tutte le operazioni.
		public static void esercizio16() {
			Stack<String> stack = new Stack<>();

			stack.push("Primo");
			stack.push("Secondo");
			stack.push("Terzo");

			System.out.println("Elemento in cima: " + stack.peek());

			System.out.println("Pop: " + stack.pop());
			System.out.println("Pop: " + stack.pop());

			System.out.println("Elemento in cima: " + stack.peek());
		}

		// 17. Scacchiera (Array 2D + Logica)
		// Crea una scacchiera 8x8 in un array 2D e popola la prima riga con “Torre”, “Cavallo”, ecc.
		// Nel main, stampa la scacchiera.
		public static void esercizio17() {
			String[][] scacchiera = new String[8][8];

			String[] primaRiga = {"Torre", "Cavallo", "Alfiere", "Regina", "Re", "Alfiere", "Cavallo", "Torre"};
			scacchiera[0] = primaRiga;


			for (int r = 1; r < 8; r++) {
				for (int c = 0; c < 8; c++) {
					scacchiera[r][c] = ".";
				}
			}

			for (int r = 0; r < 8; r++) {
				for (int c = 0; c < 8; c++) {
					System.out.print(scacchiera[r][c] + "\t");
				}
				System.out.println();
    		}
		}


		// 18. Ordina Parole (args + Arrays.sort)
		// Nel main, ricevi da args parole da ordinare alfabeticamente e stampale in ordine.
		public static void esercizio18(String[] args) {
				Arrays.sort(args);
				for(String arg:args){
						System.out.println(arg);
				}
		}

		// 19. Interfaccia Pagabile (Interfacce)
		// Crea un'interfaccia Pagabile con metodo calcolaTotale().
		// Implementa in Fattura e Abbonamento. Stampa il totale da pagare.
		public static void esercizio19() {
			Pagabile a=new Abbonamento();
			Pagabile f=new Fattura();
			f.calcolaTotale();
			a.calcolaTotale();
		}

		// 20. Diario di Bordo (ArrayList + Date)
		// Crea una classe VoceDiario con testo e data (usa LocalDate).
		// Nel main, aggiungi voci e stampa quelle degli ultimi 7 giorni.
		public static void esercizio20() {
			ArrayList<VoceDiario> diario = new ArrayList<>();

		diario.add(new VoceDiario("Studiare Java", LocalDate.now().minusDays(1)));
		diario.add(new VoceDiario("Fare esercizi di matematica", LocalDate.now().minusDays(5)));
		diario.add(new VoceDiario("Andare in palestra", LocalDate.now().minusDays(8))); // fuori dai 7 giorni

		LocalDate oggi = LocalDate.now();
		LocalDate setteGiorniFa = oggi.minusDays(7);

		System.out.println("Voci degli ultimi 7 giorni:");
		for (VoceDiario voce : diario) {
			if (!voce.getData().isBefore(setteGiorniFa)) { // data >= setteGiorniFa
				System.out.println(voce.getData() + ": " + voce.getTesto());
			}
		}
		}

		// 21. Sistema di Prenotazione Cinema (OOP + ArrayList + Logica)
		// Crea classi Sala, Film, Prenotazione. Ogni sala ha un numero di posti.
		// Nel main, consenti di prenotare posti per un film in una sala e verifica la disponibilità.
		public static void esercizio21() {
				Scanner scanner = new Scanner(System.in);

				// Creo una sala e un film
				Sala sala = new Sala("Sala 1", 100);
				Film film = new Film("Interstellar", 169);

				System.out.println("Benvenuto nel sistema di prenotazione cinema!");
				System.out.println("Film disponibile: " + film.getTitolo());
				System.out.println("Sala: " + sala.getNome() + " con " + sala.getPostiDisponibili() + " posti disponibili.");

				while (true) {
					System.out.print("Quanti posti vuoi prenotare? (0 per uscire): ");
					int postiRichiesti = scanner.nextInt();
					if (postiRichiesti == 0) break;

					if (sala.prenotaPosti(postiRichiesti)) {
						Prenotazione prenotazione = new Prenotazione(sala, film, postiRichiesti);
						System.out.println("Prenotazione effettuata: " + prenotazione);
						System.out.println("Posti rimanenti: " + sala.getPostiDisponibili());
					} else {
						System.out.println("Posti insufficienti! Riprova.");
					}
				}
				System.out.println("Grazie per aver usato il sistema di prenotazione.");
				scanner.close();
		}

		// 22. Gestione Ordini con Interfacce (Interfaccia + ArrayList + Polimorfismo)
		// Crea un'interfaccia Spedibile con metodo spedizione().
		// Classi OrdineOnline e OrdineNegozio la implementano in modo diverso.
		// Nel main, gestisci una lista mista di ordini e stampa il metodo di spedizione per ciascuno.
		public static void esercizio22() {
			
		}

		// 23. Registro Medico (Classi + ArrayList + Ricerca Avanzata)
		// Crea classi Paziente, Visita e Medico.
		// Nel main, inserisci dati e permetti la ricerca delle visite per un paziente specifico.
		public static void esercizio23() {
			
		}

		// 24. Gestione Catalogo Prodotti con Filtri (Generics + Funzioni + Filtri)
		// Crea una classe generica Catalogo<T> che permette di aggiungere e filtrare prodotti tramite Predicate<T>.
		// Nel main, filtra prodotti per prezzo, nome, o disponibilità.
		public static void esercizio24() {
			
		}

		// 25. Sistema Banca (Classi astratte + Ereditarietà + Overriding)
		// Classe astratta ContoBancario, sottoclassi ContoCorrente, ContoRisparmio.
		// Ogni tipo ha un metodo calcolaInteresse() diverso.
		// Nel main, calcola l’interesse per una lista di conti.
		public static void esercizio25() {
			
		}

		// 26. Gestione File Studenti (File I/O + ArrayList + Parsing)
		// Leggi un file .txt contenente dati di studenti (nome, voto)
		// Nel main, calcola la media voti e salva il risultato in un altro file.
		public static void esercizio26() {
			
		}

		// 27. Parser JSON Manuale (Stringhe + Logica + ArrayList)
		// Nel main, ricevi da args una stringa stile JSON semplice ({"nome":"Luca", "eta":22})
		// Parsa e crea un oggetto Persona, senza usare librerie esterne.
		public static void esercizio27(String[] args) {
			
		}

		// 28. Magazzino Multiclasse (ArrayList + Ereditarietà + instanceof)
		// Crea Prodotto, e classi figlie Alimentare, Elettronico.
		// Nel main, aggiungi vari prodotti e stampa solo quelli di un certo tipo.
		public static void esercizio28() {
			
		}

		// 29. Gestione Playlist (ArrayList + Oggetti + Metodi Statici)
		// Classe Canzone con titolo, artista, durata.
		// Nel main, crea una playlist e calcola la durata totale tramite metodo statico.
		public static void esercizio29() {
			
		}

		// 30. Rubrica con Ricerca Avanzata (ArrayList + Stream-like)
		// Classe Contatto con nome, numero, email.
		// Nel main, implementa ricerche dinamiche per nome parziale o dominio email.
		public static void esercizio30() {
			
		}

		// 31. Sistema di Login (HashMap + Stringhe + Sicurezza base)
		// Nel main, simula un sistema di login con utenti memorizzati in un HashMap<username, password>
		// Verifica se le credenziali inserite da args sono corrette.
		public static void esercizio31(String[] args) {
			
		}

		// 32. File Logger (FileWriter + Singleton + Data)
		// Implementa un singleton Logger che scrive log su file con timestamp.
		// Nel main, genera log da eventi diversi.
		public static void esercizio32() {
			
		}

		// 33. Parcheggio (OOP + Array + Occupazione posti)
		// Classi Auto, PostoAuto, Parcheggio.
		// Nel main, simula entrate/uscite e stampa lo stato del parcheggio.
		public static void esercizio33() {
			
		}

		// 34. Classifica Mondiale (Ereditarietà + Comparable)
		// Classe SquadraNazionale implementa Comparable per ordinamento per punti.
		// Nel main, stampa la classifica ordinata.
		public static void esercizio34() {
			
		}

		// 35. Gioco dei Dadi (OOP + Random + Logica)
		// Classe Giocatore con nome e punteggio.
		// Nel main, due giocatori lanciano 3 dadi per turno. Vince chi ha punteggio più alto dopo 5 turni.
		public static void esercizio35() {
			
		}

	public static void main(String[] args) {
		//esercizio2(args);
		//esercizio3();
		//esercizio4();
		//esercizio5();
		//esercizio6();
		//esercizio7();
		//esercizio8();
		//esercizio9();
		//esercizio10(args);
		//esercizio11();
		//esercizio12();
		//esercizio13();
		//esercizio14(args);
		//esercizio15(); // Biblioteca
		//esercizio16(); // Stack Generico
		//esercizio17(); // Scacchiera
		//esercizio18(args); // Ordina Parole 
		//esercizio19(); // Interfaccia Pagabile
		//esercizio20(); // Diario di Bordo
		//esercizio21(); // Prenotazione Cinema
		esercizio22(); // Gestione Ordini con Interfacce
		//esercizio23(); // Registro Medico
		//esercizio24(); // Catalogo con Filtri
		//esercizio25(); // Sistema Banca
		//esercizio26(); // File Studenti
		//esercizio27(args); // Parser JSON Manuale
		//esercizio28(); // Magazzino Multiclasse
		//esercizio29(); // Playlist
		//esercizio30(); // Rubrica con Ricerca
		//esercizio31(args); // Sistema di Login
		//esercizio32(); // File Logger
		//esercizio33(); // Parcheggio
		//esercizio34(); // Classifica Mondiale
		//esercizio35(); // Gioco dei Dadi
	}

}
