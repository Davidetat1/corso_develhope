/*Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra
(+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.*/

public class switch2 {
    public static void main(String args[]) {
        char operator = '-';
        String tipoOperazione = identificaOperazione(operator);
        System.out.println("Il tipo di operazione corrispondente al carattere '" + operator + "' è: " + tipoOperazione);
    }
    public static String identificaOperazione(char operator) {
        String tipoOperazione;
        switch (operator) {
            case '+':
                tipoOperazione = "addizione";
                break;
            case '-':
                tipoOperazione = "sottrazione";
                break;
            case '*':
                tipoOperazione = "moltiplicazione";
                break;
            case '/':
                tipoOperazione = "divisione";
                break;
            default:
                tipoOperazione = "errore non conosco questo carattere";
        }
        return tipoOperazione;
    }
}
