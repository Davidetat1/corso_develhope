/*Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.*/

package Java_Vol2.Getter_Setter_Es1;

public class Esercizio1_Getter_Setter {
    public static void main (String args[]){
      Studente studente1 = new Studente("Davide","Tatone", 9810);
        System.out.println("Nome: " + studente1.getNome());
        System.out.println("Cognome: " + studente1.getCognome());
        System.out.println("Identificativo: " + studente1.getIdentificativo());
    }
}

