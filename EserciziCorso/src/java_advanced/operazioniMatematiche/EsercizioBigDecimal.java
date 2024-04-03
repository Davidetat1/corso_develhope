/*

Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo

*/

package java_advanced.operazioniMatematiche;

import java.math.BigDecimal;
public class EsercizioBigDecimal {
    public static void main(String[] args) throws Exception {

     BigDecimal numero1 = new BigDecimal("10.3");
     BigDecimal numero2 = new BigDecimal("4.5");
     OperazioneAritmetica primaOperazione = OperazioneAritmetica.ADDIZIONE;

        BigDecimal risultato1 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.ADDIZIONE);
        BigDecimal risultato2 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.SOTTRAZIONE);
        BigDecimal risultato3 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.MOLTIPLICAZIONE);
        BigDecimal risultato4 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.DIVISIONE);
        BigDecimal risultato5 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.MIN);
        BigDecimal risultato6 = calcolaOperazione(numero1,numero2,OperazioneAritmetica.MAX);
        System.out.println();
        System.out.println("numero 1 = " + numero1);
        System.out.println("numero 2 = " + numero2);
        System.out.println("Prima operazione effettuata: " + primaOperazione);
    }

    public static BigDecimal calcolaOperazione(BigDecimal numero1, BigDecimal numero2, OperazioneAritmetica operazione) throws Exception {
        BigDecimal risultato = BigDecimal.ZERO;
        switch (operazione) {
            case ADDIZIONE -> {
                risultato = numero1.add(numero2);
                System.out.println("Risultato addizione: " + numero1 + " + " + numero2 + " = " + risultato);
                break;
            }
            case SOTTRAZIONE -> {
                risultato = numero1.subtract(numero2);
                System.out.println("Risultato Sottrazione: " + numero1 + " - " + numero2 + " = " + risultato);
                break;
            }
            case MOLTIPLICAZIONE -> {
                risultato = numero1.multiply(numero2);
                System.out.println("Risultato Moltiplicazione: " + numero1 + " * " + numero2 + " = " + risultato);
                break;
            }
            case DIVISIONE -> {
                if (numero1.compareTo(BigDecimal.ZERO) != 0 && numero2.compareTo(BigDecimal.ZERO) != 0){
                    risultato = numero1.divide(numero2, 2, BigDecimal.ROUND_HALF_UP);
                    System.out.println("Risultato Divisione: " + numero1 + " / " + numero2 + " = " + risultato);
                } else {
                    throw new Exception("Divisione per Zero non consentita.");
                }
                break;
            }
            case MIN -> {
                risultato = numero1.min(numero2);
                System.out.println("Minimo: " + risultato);
                break;
            }
            case MAX -> {
                risultato = numero1.max(numero2);
                System.out.println("Massimo: " + risultato);
                break;
            }
        }
        return risultato;
    }
}
