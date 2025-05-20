package main.java.esempioesame;

import java.util.ArrayList;
import main.java.esempioesame.Sviluppatore;
import main.java.esempioesame.Manager;

public class App {
    public static void main(String[] args) {
        ArrayList<Sviluppatore> sviluppatores = new ArrayList<Sviluppatore>();
        for (int i = 0; i < 10; i++) {
            sviluppatores.add(new Sviluppatore("Nome" + i, "Matricola" + i));
        }

        Manager m = new Manager("Manager", "mobile");

        for (Sviluppatore sviluppatore : sviluppatores) {
            System.out.println("paga di "+sviluppatore.getNome()+ " = "+sviluppatore.calcolaPaga());
        }

        System.out.println("paga di "+m.getNome()+ " = "+m.calcolaPaga());
    }
}

