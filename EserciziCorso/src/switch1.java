/*Scrivi un programma che contenga un metodo che prende in ingresso un
valore numerico e restituisca il nome del giorno della settimana
 come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
 */

public class switch1 {
    public static void main(String args[]) {
        int numeroGiorno = 4;
        String nomeGiorno = nomeGiornoSettimana(numeroGiorno);
        System.out.println(" il giorno che corrisponde al numero " + numeroGiorno + " è " + nomeGiorno);
    }

    public static String nomeGiornoSettimana(int numeroGiorno) {
        String nomeGiorno;

        switch (numeroGiorno) {
            case 1:
                nomeGiorno = "Lunedi";
                break;
            case 2:
                nomeGiorno = "Martedi";
                break;
            case 3:
                nomeGiorno = "Mercoledi";
                break;
            case 4:
                nomeGiorno = "Giovedi";
                break;
            case 5:
                nomeGiorno = "Venerdi";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Errore numero inserito errato";
                break;
            }
            return nomeGiorno;
        }
    }
