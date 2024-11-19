public class Scuola {
    private Aula [] aule;
    private String nomeScuola;
    private int nAule;
    private int maxAule = 34;
    
    //Metodo Costruttore
    public Scuola(String nome){
        this.nomeScuola = nome;
        this.aule = new Aula [maxAule];
    }

    //Metodo per aggiungere un'Aula dentro la Scuola
    public boolean addAula(Aula a){
        if(nAule==maxAule){
            return false;
        }
        else{
            aule[nAule] = a;
            nAule++;
            return true;
        }
    }

    //Metodo per la stampa delle Aule presenti nella Scuola
    public String stampaAule(){
        String s = new String();
        s += "[Scuola: " + nomeScuola + "]" + "\n";
        for(int i=0;i<nAule;i++){
            s+= "Aula: " + aule[i].getSezione() + "\n";
        }
        return s;
    }

    public String getNomeScuola(){
        return nomeScuola;
    }

}