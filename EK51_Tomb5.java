import java.io.*;


/*
 * Írjunk programot, amely beolvassa az elemszámot, majd pedig a tömb elemeit!
 * Számítsuk ki a pozitív adatok összegét és a negatív adatok átlagát!
 * Kiíratás előtt vizsgáljuk meg az eredményeket!
 */
public class EK51_Tomb5 {
	
	public static void main (String[] args) throws IOException {
		
		int meret, osszeg = 0, atlag_db = 0;
		double atlag = 0;
		
		BufferedReader be=new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.print("A tömb mérete: ");
		meret =Integer.valueOf(be.readLine()).intValue();
		
		int[] x = new int[meret];
		for (int i = 0; i < meret; i++) {
			
			System.out.print(i + ". elem: ");
			x[i] =Integer.valueOf(be.readLine()).intValue();			
			
		}
		
		for (int i = 0; i < meret; i++) {
			if (x[i] > 0) {
				osszeg += x[i];
			}
			if (x[i] < 0) {
				atlag += x[i];
				atlag_db++;
			}
		}
		
		if (osszeg > 0) {
			System.out.println("Pozitív adatok összege: " + osszeg);
		}
		if (atlag_db > 0) {
			atlag = (double) atlag/atlag_db;
			System.out.println("Negatív adatok átlaga: " + atlag);
		}
		
	}
	
}