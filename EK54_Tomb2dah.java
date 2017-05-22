/*
 * Készítsünk egy 6×6-os alsó háromszög mátrix tárolására alkalmas tömböt,
 * töltsük fel 1 és 2016 közötti véletlen számokkal, és jelenítsük meg az eredményt!
 */
public class EK54_Tomb2dah {
    public static void main (String[] args) {
       
        /*
         * [0][0], [0][1], [0][2], [0][3], [0][4], [0][5]
         * [1][0], [1][1], [1][2], [1][3], [1][4], [1][5]
         * [2][0], [2][1], [2][2], [2][3], [2][4], [2][5]
         * [3][0], [3][1], [3][2], [3][3], [3][4], [3][5]
         * [4][0], [4][1], [4][2], [4][3], [4][4], [4][5]
         * [5][0], [5][1], [5][2], [5][3], [5][4], [5][5]
         *
         * i==j,    i<j,    i<j,    i<j,     i<j,    i<j
         * i>j,        i==j,    i<j,    i<j,     i<j,    i<j
         * i>j,        i>j,    i==j,    i<j,     i<j,    i<j
         * i>j,        i>j,    i>j,    i==j,    i<j,    i<j
         * i>j,        i>j,    i>j,     i>j,    i==j,    i<j
         * i>j,        i>j,    i>j,    i>j,    i>j,    i==j   
         *
         */
       
        //int r1 = (int) (Math.random()*5)+3;
        /*
        int myRand = (int) (Math.random()*2016)+1;
        System.out.println(myRand);
        */
        long [][] x = new long [6][]; // a sorok 6 elemű vektora
       // minden sor hossza más és más
        
        for (int i = 0; i<x.length; i++) {
        	x[i] = new long [i+1];
        }
        	// a tömb feltöltése
        for (int i = 0; i<x.length; i++) {
        	
                for (int j = 0; j<x[i].length; j++) {
                
                    x[i][j] = (long) (Math.random()*2016+1);
                    //System.out.print(x[i][j]);
                }
                
        }
               
        
        System.out.println("Az x tömb tartalma: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
       
        System.out.println("Az első sor első oszlopának eleme: " + x[0][0]);
        System.out.println("A második sor első oszolának eleme: " + x[1][0]);
        System.out.println("Az első sor második oszolának eleme: " + x[0][1]);

    }

}