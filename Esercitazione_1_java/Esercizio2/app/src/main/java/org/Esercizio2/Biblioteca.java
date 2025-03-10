package org.Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<MaterialeBibliotecario> catalogo;
        public Biblioteca(){
                catalogo= new ArrayList<MaterialeBibliotecario>();
        }
        public void aggiungiLibro(Libro libro){
                this.catalogo.add(libro);
                System.out.println("il libro "+libro.getTitolo()+" è stato aggiunto al catalogo");
        }
        public void removeLibro(Libro libro){
                this.catalogo.remove(libro);
                System.out.println("il libro "+libro.getTitolo()+" è stato rimosso dal catalogo");
        }
        public void consultaCatalogo(){
                for(MaterialeBibliotecario materiale: catalogo){
                        System.out.println(materiale);
                }
        }
}
