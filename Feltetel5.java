import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 */
public class Feltetel5 {
	public static void main(String[] args) throws IOException {
		double x;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("Pozitív egész szám: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		
		
		
		if (x > 0 && x % 2 == 0) {
			
			System.out.println(x + " páros.");
			if (x % 3 == 0){
				
				System.out.println(x + " osztható hárommal.");

			}
			else {
				System.out.println(x + " nem osztható hárommal.");

			}

		}
		 
		else if (x > 0 && x % 2 == 1){
			System.out.println(x + " páratlan.");
			if (x % 3 == 0){
				
				System.out.println(x + " osztható hárommal.");

			}
			else {
				System.out.println(x + " nem osztható hárommal.");

			}
		}
		
		else {
			System.out.println(x + " hibás adat.");

		}
		
	}

}
