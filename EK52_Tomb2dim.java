/*
 * Egy egész típusú 4×4-es mátrixot töltsünk fel úgy ,hogy a felső háromszög 1-es, a főátló 2-es
 * és az alsó háromszög 3-as értékeket vegyen fel. Számítsuk ki a főátlóbeli elemek szorzatát és
 * a főátló alatti elemek összegét!
 */
public class EK52_Tomb2dim {
    public static void main (String[] args) {
        int[][] peldamatrix =     {     {2, 1, 1, 1},
                                    {3, 2, 1, 1},   
                                    {3, 3, 2, 1},   
                                    {3, 3, 3, 2}    };
        /*
         * [0][0], [0][1], [0][2], [0][3]
         * [1][0], [1][1], [1][2], [1][3]
         * [2][0], [2][1], [2][2], [2][3]
         * [3][0], [3][1], [3][2], [3][3]
         *
         * i==j,    i<j,    i<j,    i<j
         * i>j,        i==j,    i<j,    i<j
         * i>j,        i>j,    i==j,    i<j
         * i>j,        i>j        i>j,    i==j
         *
         */
       
       
        // egy szimmetrikus mátrix főátlóbeli elemeinek sor- és oszlopindexe megegyezik: i == j
       
        final int MERET = 4;
        int osszeg = 0, szorzat = 1;
       
        // a tömb feltöltése
        int [][] x = new int [MERET][MERET];
        for (int i = 0; i < MERET; i++) {
            for (int j = 0; j < MERET; j++) {
                if (i == j) {
                    x[i][j] = 2;
                }
                else if (i < j) {
                    x[i][j] = 1;
                }
                else {
                    x[i][j] = 3;
                }
            }
        }
        // a tömb kiiratás
        System.out.println("Az x tömb tartalma: ");
       
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + "   ");
            }
            System.out.println();
        }
       
        // a főátlóbeli elemek: (i==j)
        // a főátló alatti elemek: (i>j)
       
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[0].length; j++) {
                if (i==j) {
                    szorzat *= x[i][j];
                }
                else if (i>j) {
                    osszeg += x[i][j];
                }
            }
        }
       
        System.out.println("A főátlóbeli elemek szorzata: " + szorzat);
        System.out.println("A főátló alatti elemek összege: " + osszeg);

    }
}