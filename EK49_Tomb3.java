import java.io.*;


/*
 * Írjunk programot, amely MERET darabszámú egész típusú adatot olvas be!
 * Csak a konstans index tömbben megadott elemeket jelenítsük meg, és számítsuk ki a szorzatukat!
 */
public class EK49_Tomb3 {
	
	public static void main (String[] args) throws IOException {
		
		final int INDEX_DB = 4; // ennyi indexét nézzük a tömbnek
		final int MERET = 8; // a mérete a tömbnek
		final int index[] = { 2, 4, 5, 7}; // a konstans indexek: a 2., 4., 5., 7. elemét jeleníti meg majd a tömbnek
		int szorzat = 1;
		int[] x = new int [MERET];
		
		BufferedReader be=new BufferedReader
				(new InputStreamReader(System.in));
		System.out.println("Adatok száma: " + MERET);
		
		for (int i = 0; i<MERET; i++) {
			System.out.print("adat: ");
			x[i] =Integer.valueOf(be.readLine()).intValue();

		}
		
		System.out.println("Összeszorzandó elemek");
		System.out.println("Index\t Adat");
		
		for (int i = 0; i<INDEX_DB; i++) {
			szorzat *= x[index[i]];
			System.out.println(index[i] + "\t" + x[index[i]]);
		}
		System.out.println("Szorzat: " + szorzat);
		
		
	}
	
}