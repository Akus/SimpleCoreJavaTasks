import java.io.*;


/*
 * Írjunk programot ami végtelen while ciklusban a nulla érték megadásáig olvas egész számokat!
 * Páratlan és hárommal osztható szám beolvasásakor continue utasítással hagyjuk ki az aktuális
 * cikluslépést! Határozzuk meg a páros adatok számát, valamint a beolvasott összes adat számát!
 * Számítsuk ki a beolvasott adatok összegét, a páratlan és a hárommal oszthatók kivételével!
 */
public class EK39_While3 {
	
	public static void main (String[] args) throws IOException {
	
		int szam, paros_db = 0, n = 0, osszeg = 0;
		
		BufferedReader be=new BufferedReader
			(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Pozitív egész szám: ");
			szam =Integer.valueOf(be.readLine()).intValue();
			n++;
			
			if (szam % 2 != 0 && szam % 3 == 0) {
				System.out.println("Páratlan és hárommal osztható: " + szam + " --> continue");
				continue;
			}
			
			if (szam % 2 == 0) {
				paros_db++;
				osszeg += szam;
			}
			
			if (szam == 0) {
				System.out.println("Zérus adat --> break");
				break;
			}
			//osszeg += szam; -> a könyvben hibásan szerepel, itt ugyanis a páratlanokat is számolja.


		}
		System.out.println("Összes szám: " + n);
		System.out.println("Páros számok: " + paros_db);
		System.out.println("Páros számok összege: " + osszeg);

	}
}