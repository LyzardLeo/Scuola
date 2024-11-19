public class Studente{
    private String nome;
    private String cognome;

    //Metodo Costruttore
    public Studente(String nome,String cognome){
        this.nome=nome;
        this.cognome=cognome;
    }


    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String toString(){
        return "Nome: " + nome + "Cognome: " + cognome;
    }
}