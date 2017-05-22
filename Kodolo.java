/*
 * Írjunk programot amiben int típusú értékeken bemutatja a KIZÁRÓ VAGY ^ művelettel való kódolást,
 * és a kódolt adata visszaállítását!
 */
public class Kodolo {
public static void main(String[] args) {
	int kod = 123456, adat = 1982;
	System.out.println("Kódolandó adat: " + adat);
	adat = adat ^ kod;
	System.out.println("Kódolt adat: " + adat);
	adat = adat ^ kod;
	System.out.println("Visszakódolás (^): " + adat);


}
}
