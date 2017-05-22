import java.io.*;


/*
 * Írjunk programot ami végtelen while ciklusban a nulla érték megadásáig olvas egész számokat!
 * Páratlan és hárommal osztható szám beolvasásakor continue utasítással hagyjuk ki az aktuális
 * cikluslépést! Határozzuk meg a páros adatok számát, valamint a beolvasott összes adat számát!
 * Számítsuk ki a beolvasott adatok összegét, a páratlan és a hárommal oszthatók kivételével!
 */
public class EK40_For2 {
	
	public static void main (String[] args) throws IOException {
	
		int szam, szorzat = 1, n = 0, nullak = 0;
		
		BufferedReader be=new BufferedReader
			(new InputStreamReader(System.in));
		
		for (;;) {
			
			n++;
			
			System.out.println("Egész szám: ");
			szam =Integer.valueOf(be.readLine()).intValue();
			//System.out.println("Egész szám: " + szam);

			
			if (szam < 0) {
				continue;
			}
			else if (szam > 0){
				szorzat *= szam;
				//System.out.println("szorzat: " + szorzat);
			}
			
			if (szam == 0) {
				nullak++;
			}
				
			else {
					nullak = 0;
			}
			
			if (nullak == 2) {
				n--;
				break;
			}
			
			}
			
			
		System.out.println("Összes szám: " + n);
		System.out.println("Pozitív adatok szorzata: " + szorzat);

		
	}
	
}