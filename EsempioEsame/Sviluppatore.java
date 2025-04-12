package EsempioEsame;

public class Sviluppatore extends Dipendente{
    private String matricola;
    public Sviluppatore(String nome, String matricola){
        super(nome);
        this.matricola = matricola;
    }

    @Override
    public void lavora(){
        System.out.println("Sviluppatore Lavora");
    }

    @Override
    public double calcolaPaga() {
        System.out.println("Calcolo paga");
        return 2000;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}

