/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato
calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
per calcolare l'area del rettangolo.
 */

package java_vol3.ereditarità.es2;

public class Forma {
    public double calcolaArea() {
        System.out.println("non puoi calcolare l'area di una forma generica");
        return 0;
    }
}