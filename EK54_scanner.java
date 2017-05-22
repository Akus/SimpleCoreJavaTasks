import java.util.Scanner;

public class EK54_scanner {
public static void main (String[] args) {
    int meret;
       
    Scanner be = new Scanner(System.in);
       
    System.out.println("A gyümi tömb mérete:");
    meret = be.nextInt();


    String[] gyumi = new String[meret];
   
   
    /*
     * The nextInt() just takes the number and leaves the token at the end which makes the nextLine() to skip user input.
     * Here's a sample problem and a possible solution of putting a dummy nextLine() after the nextInt().
     */
    be.nextLine(); // dummy nextLine();
   
    System.out.println("A gyümi tömb elemei: ");
    for (int i = 0; i < meret; i++) {
        System.out.println(i + ". elem: ");
        gyumi[i] = be.nextLine();
       
    }
    System.out.println("\nA gyümi tömb elemei listában: ");

    for (int i = 0; i < gyumi.length; i++) {
        System.out.println(i + ". elem: " + gyumi[i]);
    }
    be.close();

}
}