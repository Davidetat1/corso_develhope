/*Scrivi un programma che contiene un metodo che dati 2 interi in ingresso
ed un valore di confronto verifichi
se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione
comprensivo dei due limiti (inferiore e superiore)
 */

public class operatori_logici1 {
    public static void main (String args[]){
     int limiteInferiore = 40;
     int limiteSuperiore= 50;
     int limiteDiConfronto = 45;

        System.out.println("il valore inferiore è = " + limiteInferiore);
        System.out.println("il valore superiore è = " + limiteSuperiore);
        System.out.println("il valore da confrontare è = " + limiteDiConfronto);
        System.out.println("il valore " + limiteDiConfronto + " è compreso tra i due valori? " + confronto(limiteInferiore,limiteSuperiore,limiteDiConfronto));
    }
public static boolean confronto (int limiteInferiore, int limiteSuperiore, int valoreDiConfronto){
    return (valoreDiConfronto > limiteInferiore && limiteSuperiore > valoreDiConfronto);
    }
}


