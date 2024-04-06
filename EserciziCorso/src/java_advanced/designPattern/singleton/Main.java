/*

Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

 */

package java_advanced.designPattern.singleton;

public class Main {
    public static void main(String[] args) {

        User user1 = User.getInstance();
        System.out.println("informazioni user1");
        user1.stampaInfo();
        System.out.println();

        User user2 = User.getInstance();
        System.out.println("informazioni user2");
        user2.setNome("Pino");
        user2.setEta(100);
        user2.stampaInfo();


        System.out.println("\nInformazioni aggionrate user1 e user2 dopo la modifica:");
        user1.stampaInfo();
        user2.stampaInfo();
    }
}
