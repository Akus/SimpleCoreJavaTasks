/*
 * Írjunk programot, amely egy int típusú értéket kettővel jobbra, illetve balra léptet!
 * Egész szám bitjeinek n lépéssel történő balra tolása (szám<<n) a szám 2^n értékkel való szorzását eredményezi.
 * Egész szám bitjeinek n lépéssel történő jobbra tolása (szám>>n) a szám 2^n értékkel való osztásának felel meg.
 */
public class Bitlepteto {
public static void main (String[] args) {
	int a = 12;
	System.out.println("adat: " + a);
	System.out.println(a + " >> 2 = " + (a >> 2));
	System.out.println(a + " << 2 = " + (a << 2));

}
}
