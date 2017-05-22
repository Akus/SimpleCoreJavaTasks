import java.io.*;

/*
 * Írjunk programot amely egy egész számról kijelzi, hogy pozitív, negatív vagy zérus!
 */
public class Feltetel3 {
	public static void main(String[] args) throws IOException {
		double x, y, z, atlag;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("1. Adat: ");
		x = Integer.valueOf(be.readLine()).intValue();
		System.out.print("2. Adat: ");
		y = Integer.valueOf(be.readLine()).intValue();
		System.out.print("3. Adat: ");
		z = Integer.valueOf(be.readLine()).intValue();
		
		
		
		if (x > 0 && y > 0 && z > 0) {
			atlag = (x+y+z)/3;
			System.out.println("Átlag: " + atlag);

		}
		else {
			System.out.println("Negatív adat!");

		}
		
		
	}

}
