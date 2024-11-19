public class Aula {
    private Studente [] studenti;
    private  int nStudenti;
    private String sezione;
    private int maxStudenti;
    
    //Metodo Costruttore
    public Aula(String sezione){
        this.sezione=sezione;
        this.nStudenti = 0;
        this.maxStudenti = 27;
        this.studenti = new Studente [maxStudenti];
    }

    //Metodo per aggiungere uno studente.
    public boolean addStudente(Studente s){
        if(nStudenti==maxStudenti){
            return false;
        }
        else{
            studenti[nStudenti] = s;  
            nStudenti++;
            return true;
        }
    }

    //Metodo per la stampa degli studenti presenti nelle Aule
    public String stampaStudente(){
        String s = new String();
        s += "[" + sezione + "]" + "\n";
        for(int i=0;i<nStudenti;i++){
            s+= "Studente: " + studenti[i].getNome() + " " + studenti[i].getCognome() + "\n";
        }
        return s;
    }

    public String getSezione(){
        return sezione;
    }
    
}
