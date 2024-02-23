
/*Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
"Lunghezza minore di 10" o "Lunghezza pari a 10".
 */


public class if_Else2 {
    public static void main (String args []){
        String mioNome = "Davide Tatone";
        int lunghezzaStringa = mioNome.length();

            if ( lunghezzaStringa < 10 ){
                System.out.println("la stringa " + mioNome + " è lunga meno di 10 caratteri");
            }else if ( lunghezzaStringa > 10 ){
                System.out.println("la stringa " + mioNome + " è lunga più di 10 caratteri");
            }else {
                System.out.println("la stringa " + mioNome + " è uguale a 10 caratteri");
            }


    }
}
