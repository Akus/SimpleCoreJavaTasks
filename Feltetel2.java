import java.io.*;

/*
 * Írjunk programot amely egy egész számról kijelzi, hogy pozitív, negatív vagy zérus!
 */
public class Feltetel2 {
	public static void main(String[] args) throws IOException {
		int x;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("Adat: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		if (x > 0) {
			System.out.println(x + " pozitív szám.");
		}
		else if ( x < 0){
			System.out.println(x + " negatív szám.");

		}
		else {
			System.out.println(x + " zérus.");

		}
		
		
	}

}
