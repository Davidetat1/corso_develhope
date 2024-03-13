/*
Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
 */
package java_advanced.nullability;

public class Nullability {
    public static void main(String[] args) throws Exception {
        Integer numeratore = 4;
        Integer denominatore = null;

        try {
            //checkNumDen(numeratore,denomitatore);
            divisione(numeratore, denominatore);
        } catch (ArithmeticException e) {
            System.out.println("Eccezione del primo blocco di codice: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Eccezione del secondo blocco di codice: " + e.getMessage());
        }
    }
   /* public static void checkNumDen(Integer numeratore, Integer denominatore){
        if (numeratore == null || denominatore == null) {
           throw new NullPointerException("Numeratore o Denominatore null");

        }
    }

     ( avevo inizialmente fatto cosi, creando due funzioni, poi leggendo meglio la traccia
      ho provato ad unire il tutto in unica funzione )
*/

    public static void divisione(Integer numeratore, Integer denominatore) throws Exception{
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException("Numeratore o Denominatore null");
        }
        if (denominatore == 0) {
            throw new ArithmeticException("Errore: divsione per 0");
        }
        System.out.println("Risultato divisione: " + numeratore + "/" + denominatore + " = " + (numeratore / denominatore));
    }
}
