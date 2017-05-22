import java.io.*;

/*
 * Írjunk programot amely egy egész számról kijelzi, hogy páros vagy páratlan, majd pedig megnézi a 100-hoz való viszonyát!
 */
public class Feltetel1 {
	public static void main(String[] args) throws IOException {
		int x;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("Adat: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		if (x % 2 == 0) {
			System.out.println(x + " páros szám.");
		}
		else  {
			System.out.println(x + " páratlan szám.");

		}
		
		if (x > 100) {
			System.out.println(x + " nagyobb mint 100.");
		}
		else {
			System.out.println(x + " kisebb mint 100.");

		}
		
	}

}
