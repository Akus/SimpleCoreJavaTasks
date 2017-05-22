// Matematikai függvények használata
public class MathFunctions {
	public static void main(String[] args) {
        double adat = 4;
        double gyok, negyzet, kobgyok1, kobgyok2;
        double a = 3, b = 4, szog = 90, c;
        gyok = Math.sqrt(adat);                     // gyökvonás
        negyzet = Math.pow(adat, 2);                // négyzetre emelés
        kobgyok1 = Math.exp(Math.log(adat)/3.0);    // köbgyök
        kobgyok2 = Math.pow(adat, 1.0/3.0);         // köbgyök máshogy
        System.out.println("Adat: " + adat);
        System.out.println("\nGyok: " + gyok);
        System.out.println("Negyzet: " + negyzet);
        System.out.println("1. Kobgyok: " + kobgyok1);
        System.out.println("2. Kobgyok: " + kobgyok2);

    }
}
