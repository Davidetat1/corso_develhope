/*
Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare
le sue righe e le sue colonne stampandola a video.

Matrice di partenza

1 2 3
4 5 6
Matrice risultato

 1 4
 2 5
 3 6
 */
public class array_2D_2 {
        public static void main(String[] args) {
            int[][] matrice = {{1, 2, 3}, {4, 5, 6}};

            System.out.println("Matrice di partenza:");
            stampaMatrice(matrice);

            System.out.println("\nMatrice risultato:");
            int[][] scambiaMatrice = scambiaRigheColonne(matrice);
            stampaMatrice(scambiaMatrice);
        }

        public static int[][] scambiaRigheColonne(int[][] matrice) {
            int righe = matrice.length;
            int colonne = matrice[0].length;

            int[][] scambiaMatrice = new int[colonne][righe];

            for (int i = 0; i < righe; i++) {
                for (int j = 0; j < colonne; j++) {
                    scambiaMatrice[j][i] = matrice[i][j];
                }
            }

            return scambiaMatrice;
        }

        public static void stampaMatrice(int[][] matrice) {
            for (int[] riga : matrice) {
                for (int elementi : riga) {
                    System.out.print(elementi + " ");
                }
                System.out.println();
            }
        }
    }
