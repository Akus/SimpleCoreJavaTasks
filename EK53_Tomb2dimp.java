public class EK53_Tomb2dimp {
    public static void main (String[] args) {
        int[][] matrix =     {     {2, 4, 5, -6},
                                {3, 5, 0,  7}    };
        System.out.println("A matrix tomb sorainak száma [sor][oszlop] (matrix.length): " + matrix.length);
        System.out.println("A matrix tomb oszlopainak száma [sor][oszlop] (matrix[0].length): " + matrix[0].length);

       
        System.out.println("A matrix tömb tartalma: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
       
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A 0. sorban a 0. oszlop eleme: " + matrix[0][0]);
        System.out.println("A 0. sorban az 1. oszlop eleme: " + matrix[0][1]);
        System.out.println("A 0. sorban a 2. oszlop eleme: " + matrix[0][2]);
        System.out.println("A 0. sorban a 3. oszlop eleme: " + matrix[0][3]);
        System.out.println("Az 1. sorban a 0. oszlop eleme: " + matrix[1][0]);
        System.out.println("Az 1. sorban a 1. oszlop eleme: " + matrix[1][1]);
        System.out.println("Az 1. sorban a 2. oszlop eleme: " + matrix[1][2]);
        System.out.println("Az 1. sorban a 3. oszlop eleme: " + matrix[1][3]);
        System.out.println();
        System.out.println("Az 0. sor első eleme: " + matrix[0][0]);
        System.out.println("Az 1. sor első eleme: " + matrix[1][0]);
       
        System.out.println("Az 2. sor első eleme: " + matrix[2][0]);

    }
}