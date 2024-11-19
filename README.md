## Struttura del progetto

Il progetto e strutturato in 3 classi:

## Classe Studente:
La classe studente è composta da due attributi *Nome* e *Cognome* che si riferiscono allo studente.
## Classe Aula:
La classe Aula è composta dall'attributo *sezione* e da una lista di Studenti, in oltre contiene due metodi,il metodo **addStudente()** che ci permette di aggiungere lo studente all'aula.Tale metodo riceve come parametro un oggetto di classe Studente e restituisce un valore *True* nel caso l'inserimento è andato a buon fine, *False* altrimenti. Un inserimento può fallire se è stato raggiunto il numero massimo di Studenti per Aula e il metodo **stampaStudente()**, tale metodo restituisce una *Stringa concatenata* con le informazioni dello Studente.
## Classe Scuola:
La classe Scuola è composta dall'attributo *nomeScuola* e da una lista di Aule, in oltre contiene 2 metodi,il metodo **addAula()** che ci permette di aggiungere l'aula nella scuola.Tale metodo riceve come parametro un oggetto di classe Aula e restituisce un valore *True* nel caso l'inserimento è andato a buon fine, *False* altrimenti. Un inserimento può fallire se è stato raggiunto il numero massimo di Studenti per Aula e il metodo **stampaAule()**, tale metodo restituisce una *Stringa concatenata* con le informazioni delle Aule presenti nella Scuola.

> *Idealizzato da:* LyzardLeo AKA Bot.py
