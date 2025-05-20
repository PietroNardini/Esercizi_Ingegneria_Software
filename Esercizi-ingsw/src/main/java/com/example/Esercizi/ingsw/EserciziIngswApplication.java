package com.example.Esercizi.ingsw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
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
import com.example.Esercizi.ingsw.esercizio22.Spedibile;
import com.example.Esercizi.ingsw.esercizio23.Medico;
import com.example.Esercizi.ingsw.esercizio23.Paziente;
import com.example.Esercizi.ingsw.esercizio23.Visita;
import com.example.Esercizi.ingsw.esercizio24.Catalogo;
import com.example.Esercizi.ingsw.esercizio22.OrdineNegozio;
import com.example.Esercizi.ingsw.esercizio22.OrdineOnline;
import com.example.Esercizi.ingsw.esercizio24.Prodottoes24 ;
import com.example.Esercizi.ingsw.esercizio25.ContoBancario;
import com.example.Esercizi.ingsw.esercizio25.ContoCorrente;
import com.example.Esercizi.ingsw.esercizio25.ContoRisparmio;
import com.example.Esercizi.ingsw.esercizio26.StudenteDaFile;
import com.example.Esercizi.ingsw.esercizio27.PersonaJson;
import com.example.Esercizi.ingsw.esercizio28.Alimentare;
import com.example.Esercizi.ingsw.esercizio28.Elettronico;
import com.example.Esercizi.ingsw.esercizio28.ProdottoMagazzino;
import com.example.Esercizi.ingsw.esercizio29.Canzone;
import com.example.Esercizi.ingsw.esercizio30.Contatto;
import com.example.Esercizi.ingsw.esercizio32.Logger;
import com.example.Esercizi.ingsw.esercizio33.AutoEs33;
import com.example.Esercizi.ingsw.esercizio33.Parcheggio;
import com.example.Esercizi.ingsw.esercizio34.SquadraNazionale;
import com.example.Esercizi.ingsw.esercizio35.Giocatore;

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
				ArrayList<Spedibile> ordini = new ArrayList<>();

				// Aggiunta di ordini misti
				ordini.add(new OrdineOnline("ON123"));
				ordini.add(new OrdineNegozio("NG456"));
				ordini.add(new OrdineOnline("ON789"));
				ordini.add(new OrdineNegozio("NG012"));

				for (Spedibile ordine : ordini) {
					ordine.spedizione();
				}
		}

		// 23. Registro Medico (Classi + ArrayList + Ricerca Avanzata)
		// Crea classi Paziente, Visita e Medico.
		// Nel main, inserisci dati e permetti la ricerca delle visite per un paziente specifico.
		public static void esercizio23() {
					Scanner scanner = new Scanner(System.in);

					ArrayList<Visita> visite = new ArrayList<>();

					Paziente p1 = new Paziente("Mario Rossi", "RSSMRA80A01H501U");
					Paziente p2 = new Paziente("Laura Bianchi", "BNCLRA85C41F205Z");

					Medico m1 = new Medico("Dott. Verdi", "Cardiologia");
					Medico m2 = new Medico("Dott.ssa Neri", "Dermatologia");

					visite.add(new Visita(p1, m1, "2025-04-01", "Controllo annuale"));
					visite.add(new Visita(p2, m2, "2025-04-10", "Allergia cutanea"));
					visite.add(new Visita(p1, m2, "2025-05-05", "Visita dermatologica"));

					System.out.print("Inserisci codice fiscale del paziente: ");
					String cfRicerca = scanner.nextLine();

					System.out.println("\nVisite trovate:");
					boolean trovata = false;
					for (Visita v : visite) {
						if (v.getPaziente().getCodiceFiscale().equalsIgnoreCase(cfRicerca)) {
							System.out.println(v.getDettagli());
							trovata = true;
						}
					}

					if (!trovata) {
						System.out.println("Nessuna visita trovata per il paziente con CF: " + cfRicerca);
					}

					scanner.close();
    
		}

		// 24. Gestione Catalogo Prodotti con Filtri (Generics + Funzioni + Filtri)
		// Crea una classe generica Catalogo<T> che permette di aggiungere e filtrare prodotti tramite Predicate<T>.
		// Nel main, filtra prodotti per prezzo, nome, o disponibilità.
		public static void esercizio24() {
			 Catalogo<Prodottoes24> catalogo = new Catalogo<>();

        // Aggiunta prodotti di esempio
        catalogo.aggiungi(new Prodottoes24("Laptop", 999.99, true));
        catalogo.aggiungi(new Prodottoes24("Mouse", 19.99, true));
        catalogo.aggiungi(new Prodottoes24("Stampante", 89.90, false));
        catalogo.aggiungi(new Prodottoes24("Monitor", 150.00, true));
        catalogo.aggiungi(new Prodottoes24("Tastiera", 29.90, false));

        // Filtro: prezzo < 100
        System.out.println("Prodotti sotto i 100 euro:");
        List<Prodottoes24> economici = catalogo.filtra(p -> p.getPrezzo() < 100);
        economici.forEach(System.out::println);

        // Filtro: disponibili
        System.out.println("\nProdotti disponibili:");
        List<Prodottoes24> disponibili = catalogo.filtra(Prodottoes24::isDisponibile);
        disponibili.forEach(System.out::println);

        // Filtro: nome contiene 'top'
        System.out.println("\nProdotti con nome che contiene 'top':");
        List<Prodottoes24> conNome = catalogo.filtra(p -> p.getNome().toLowerCase().contains("top"));
        conNome.forEach(System.out::println);
    }
		

		// 25. Sistema Banca (Classi astratte + Ereditarietà + Overriding)
		// Classe astratta ContoBancario, sottoclassi ContoCorrente, ContoRisparmio.
		// Ogni tipo ha un metodo calcolaInteresse() diverso.
		// Nel main, calcola l’interesse per una lista di conti.
		public static void esercizio25() {
			List<ContoBancario> conti = new ArrayList<>();
			conti.add(new ContoCorrente("Mario Rossi", 1000));
			conti.add(new ContoRisparmio("Luisa Verdi", 2000));
			conti.add(new ContoCorrente("Anna Bianchi", 1500));
			conti.add(new ContoRisparmio("Giorgio Neri", 3000));

			for (ContoBancario conto : conti) {
				System.out.println(conto);
			}
		}

		// 26. Gestione File Studenti (File I/O + ArrayList + Parsing)
		// Leggi un file .txt contenente dati di studenti (nome, voto)
		// Nel main, calcola la media voti e salva il risultato in un altro file.
		public static void esercizio26() {
				List<StudenteDaFile> studenti = new ArrayList<>();
				String inputFile = "src\\main\\java\\com\\example\\Esercizi\\ingsw\\esercizio26\\studenti.txt";
				String outputFile = "src\\main\\java\\com\\example\\Esercizi\\ingsw\\esercizio26\\media.txt";

				try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
					String riga;
					while ((riga = br.readLine()) != null) {//legge riga per riga finchè ci sono righe da leggere
						String[] parts = riga.split(",");//divide la riga
						if (parts.length == 2) {
							String nome = parts[0].trim();//prendo il nome
							double voto = Double.parseDouble(parts[1].trim());//prendo il voto
							studenti.add(new StudenteDaFile(nome, voto));//creo lo studente
						}
					}
				} catch (IOException e) {
					System.out.println("Errore nella lettura del file: " + e.getMessage());
					return;
				}

				if (studenti.isEmpty()) {
					System.out.println("Nessun dato letto.");
					return;
				}

				double somma = 0;
				for (StudenteDaFile s : studenti) {//per ogni nome calcola la somma dei voti
					somma += s.getVoto();
				}
				double media = somma / studenti.size();//e la media

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
					bw.write("Media voti: " + media);
					System.out.println("Media scritta su " + outputFile);
				} catch (IOException e) {
					System.out.println("Errore nella scrittura del file: " + e.getMessage());
				}
		}


		// 27. Parser JSON Manuale (Stringhe + Logica + ArrayList)
		// Nel main, ricevi da args una stringa stile JSON semplice ({"nome":"Luca", "eta":22})
		// Parsa e crea un oggetto Persona, senza usare librerie esterne.
		public static void esercizio27(String[] args) {
			if (args.length == 0) {
            System.out.println("Fornire una stringa JSON negli args.");
            return;
        }

			String json = args[0].trim();

			// Rimozione delle parentesi graffe
			if (json.startsWith("{") && json.endsWith("}")) {
				json = json.substring(1, json.length() - 1);
			} else {
				System.out.println("Formato JSON non valido.");
				return;
			}

			String[] coppie = json.split(",");

			String nome = null;
			int eta = -1;

			for (String coppia : coppie) {
				String[] keyValue = coppia.split(":");

				if (keyValue.length != 2) continue;

				String chiave = keyValue[0].replaceAll("\"", "").trim();
				String valore = keyValue[1].replaceAll("\"", "").trim();

				if (chiave.equals("nome")) {
					nome = valore;
				} else if (chiave.equals("eta")) {
					try {
						eta = Integer.parseInt(valore);
					} catch (NumberFormatException e) {
						System.out.println("Errore nel parsing dell'età.");
						return;
					}
				}
			}

			if (nome != null && eta != -1) {
				PersonaJson p = new PersonaJson(nome, eta);
				System.out.println(p);
			} else {
				System.out.println("Chiavi 'nome' o 'eta' mancanti o non valide.");
			}
    	}
		

		// 28. Magazzino Multiclasse (ArrayList + Ereditarietà + instanceof)
		// Crea Prodotto, e classi figlie Alimentare, Elettronico.
		// Nel main, aggiungi vari prodotti e stampa solo quelli di un certo tipo.
		public static void esercizio28() {
			ArrayList<ProdottoMagazzino> magazzino = new ArrayList<>();

        magazzino.add(new Alimentare("Pasta", 1.5));
        magazzino.add(new Elettronico("Mouse", 25.0));
        magazzino.add(new Alimentare("Pane", 1.0));
        magazzino.add(new Elettronico("TV", 299.99));

        System.out.println("=== Prodotti Alimentari ===");
        for (ProdottoMagazzino p : magazzino) {
            if (p instanceof Alimentare) {
                System.out.println(p);
            }
        }

        System.out.println("\n=== Prodotti Elettronici ===");
        for (ProdottoMagazzino p : magazzino) {
            if (p instanceof Elettronico) {
                System.out.println(p);
            }
        }
    
		}

		// 29. Gestione Playlist (ArrayList + Oggetti + Metodi Statici)
		// Classe Canzone con titolo, artista, durata.
		// Nel main, crea una playlist e calcola la durata totale tramite metodo statico.
		public static void esercizio29() {
				ArrayList<Canzone> playlist = new ArrayList<>();
				playlist.add(new Canzone("Bohemian Rhapsody", "Queen", 354));
				playlist.add(new Canzone("Imagine", "John Lennon", 183));
				playlist.add(new Canzone("Smells Like Teen Spirit", "Nirvana", 301));

				int durataTotale = Canzone.calcolaDurataTotale(playlist);
				System.out.println("Durata totale playlist: " + durataTotale + " secondi");
		}

		// 30. Rubrica con Ricerca Avanzata (ArrayList + Stream-like)
		// Classe Contatto con nome, numero, email.
		// Nel main, implementa ricerche dinamiche per nome parziale o dominio email.
		public static void esercizio30() {
				 ArrayList<Contatto> rubrica = new ArrayList<>();
					rubrica.add(new Contatto("Mario Rossi", "3331234567", "mario.rossi@gmail.com"));
					rubrica.add(new Contatto("Luca Verdi", "3347654321", "luca@libero.it"));
					rubrica.add(new Contatto("Giulia Bianchi", "3359988776", "giulia.bianchi@yahoo.com"));

					Scanner scanner = new Scanner(System.in);
					System.out.print("Cerca per nome o dominio email: ");
					String query = scanner.nextLine().toLowerCase();

					System.out.println("Risultati della ricerca:");
					for (Contatto c : rubrica) {
						if (c.getNome().toLowerCase().contains(query) || c.getEmail().toLowerCase().endsWith(query)) {
							System.out.println(c);
						}
					}
					scanner.close();
				}
		

		// 31. Sistema di Login (HashMap + Stringhe + Sicurezza base)
		// Nel main, simula un sistema di login con utenti memorizzati in un HashMap<username, password>
		// Verifica se le credenziali inserite da args sono corrette.
		public static void esercizio31(String[] args) {
				if (args.length < 2) {
					System.out.println("Uso: java Main <username> <password>");
					return;
				}

				String inputUser = args[0];
				String inputPass = args[1];

				HashMap<String, String> utenti = new HashMap<>();
				utenti.put("admin", "1234");
				utenti.put("utente1", "password1");
				utenti.put("utente2", "pass2024");

				if (utenti.containsKey(inputUser) && utenti.get(inputUser).equals(inputPass)) {
					System.out.println("Login riuscito!");
				} else {
					System.out.println("Credenziali non valide.");
				}
			}
				

		// 32. File Logger (FileWriter + Singleton + Data)
		// Implementa un singleton Logger che scrive log su file con timestamp.
		// Nel main, genera log da eventi diversi.
		public static void esercizio32() {
				Logger logger = Logger.getInstance();
				logger.log("Applicazione avviata.");
				logger.log("Utente ha eseguito il login.");
				logger.log("Operazione completata con successo.");
		}

		// 33. Parcheggio (OOP + Array + Occupazione posti)
		// Classi Auto, PostoAuto, Parcheggio.
		// Nel main, simula entrate/uscite e stampa lo stato del parcheggio.
		public static void esercizio33() {
			Parcheggio parcheggio = new Parcheggio(5);

			AutoEs33 a1 = new AutoEs33("AB123CD");
			AutoEs33 a2 = new AutoEs33("EF456GH");
			AutoEs33 a3 = new AutoEs33("IJ789KL");

			parcheggio.entra(a1);
			parcheggio.entra(a2);
			parcheggio.entra(a3);

			parcheggio.stampaStato();

			System.out.println("Uscita auto EF456GH...");
			parcheggio.esci("EF456GH");

			parcheggio.stampaStato();
		}

		// 34. Classifica Mondiale (Ereditarietà + Comparable)
		// Classe SquadraNazionale implementa Comparable per ordinamento per punti.
		// Nel main, stampa la classifica ordinata.
		public static void esercizio34() {
				ArrayList<SquadraNazionale> classifica = new ArrayList<>();
				classifica.add(new SquadraNazionale("Italia", 12));
				classifica.add(new SquadraNazionale("Brasile", 15));
				classifica.add(new SquadraNazionale("Francia", 9));
				classifica.add(new SquadraNazionale("Argentina", 18));

				Collections.sort(classifica);

				System.out.println("Classifica Mondiale:");
				for (SquadraNazionale squadra : classifica) {
					System.out.println(squadra);
				}
    	}
		

		// 35. Gioco dei Dadi (OOP + Random + Logica)
		// Classe Giocatore con nome e punteggio.
		// Nel main, due giocatori lanciano 3 dadi per turno. Vince chi ha punteggio più alto dopo 5 turni.
		public static void esercizio35() {
					Giocatore g1 = new Giocatore("Giocatore1");
        Giocatore g2 = new Giocatore("Giocatore2");
        Random rand = new Random();

        final int TURNI = 5;
        final int DADI_PER_TURNO = 3;

        for (int turno = 1; turno <= TURNI; turno++) {
            int punteggioG1 = 0;
            int punteggioG2 = 0;

            for (int i = 0; i < DADI_PER_TURNO; i++) {
                punteggioG1 += rand.nextInt(6) + 1;  // dado 1-6
                punteggioG2 += rand.nextInt(6) + 1;
            }

            g1.aggiungiPunteggio(punteggioG1);
            g2.aggiungiPunteggio(punteggioG2);

            System.out.println("Turno " + turno + ":");
            System.out.println(g1.getNome() + " ha totalizzato " + punteggioG1 + " punti (totale: " + g1.getPunteggio() + ")");
            System.out.println(g2.getNome() + " ha totalizzato " + punteggioG2 + " punti (totale: " + g2.getPunteggio() + ")");
            System.out.println();
        }

        if (g1.getPunteggio() > g2.getPunteggio()) {
            System.out.println("Vince " + g1.getNome() + " con " + g1.getPunteggio() + " punti!");
        } else if (g2.getPunteggio() > g1.getPunteggio()) {
            System.out.println("Vince " + g2.getNome() + " con " + g2.getPunteggio() + " punti!");
        } else {
            System.out.println("Pareggio con " + g1.getPunteggio() + " punti ciascuno!");
        }
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
		//esercizio22(); // Gestione Ordini con Interfacce
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
		esercizio35(); // Gioco dei Dadi
	}

}
