package EsempioEsame;

import java.util.ArrayList;
public class EsempioEsame {

    public static void main(String[] args) {
        ArrayList<Sviluppatore> sviluppatores = new ArrayList<Sviluppatore>();
        for (int i = 0; i < 10; i++) {
            sviluppatores.add(new Sviluppatore("Nome" + i, "Matricola" + i));
        }

        Manager m = new Manager("Manager", "mobile");

        for (Sviluppatore sviluppatore : sviluppatores) {
            sviluppatore.calcolaPaga();
        }

        m.calcolaPaga();
    }

}