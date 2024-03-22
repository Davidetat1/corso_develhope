/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */

package java_advanced.arrayList2;

public class Studente implements Comparable<Studente>{
    private String nome;
    private int eta;

    public Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public int compareTo(Studente altroStudente) {
       return this.nome.compareTo(altroStudente.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
