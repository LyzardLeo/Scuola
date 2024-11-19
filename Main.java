public class Main {
    public static void main(String args[]){


        // istanza di un'oggetto di classe scuola con i dovuti paramtri
        Scuola scuola1 = new Scuola("Liceo Scientifico Newton");
        Scuola scuola2 = new Scuola("Istituto Tecnico Tecnologico Giorgi");

        // istanza di un'oggetto di classe Studente con i dovuti paramtri
        Studente s1 = new Studente("Giovanni", "Ferrari");
        Studente s2 = new Studente("Luca", "Rossi");
        Studente s3 = new Studente("Matteo", "Bianchi");
        Studente s4 = new Studente("Antonio", "Costa");

        // istanza di un'oggetto di classe Aula con i dovuti paramtri
        Aula a1 = new Aula("Sezione A");
        Aula a2 = new Aula("Sezione B");
        Aula a3 = new Aula("Sezione C");
        Aula a4 = new Aula("Sezione D");

        // Metodi
        a1.addStudente(s1);
        a2.addStudente(s2);

        a3.addStudente(s3);
        a4.addStudente(s4);
        


        scuola1.addAula(a1);
        scuola1.addAula(a2);
        scuola2.addAula(a3);
        scuola2.addAula(a4);


        System.out.println(scuola1.stampaAule());
        System.out.println(scuola2.stampaAule());

        System.out.println(a1.stampaStudente());
        System.out.println(a2.stampaStudente());
        System.out.println(a3.stampaStudente());
        System.out.println(a4.stampaStudente());

    }
}
