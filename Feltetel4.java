import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Írjunk programot amely egy egész számról kijelzi, hogy pozitív, negatív vagy zérus!
 */
public class Feltetel4 {
	public static void main(String[] args) throws IOException {
		double x, eredmeny;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("Pozitív egész szám: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		
		
		
		if (x > 0) {
			eredmeny = Math.sqrt(x);
			System.out.println(x + " gyöke: " + eredmeny);

		}
		else {
			eredmeny = Math.pow(x, 2);
			System.out.println(x + " négyzete: " + eredmeny);

		}
		
		
	}

}
