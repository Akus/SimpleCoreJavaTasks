import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * olvassa be a program a dolgozat pontszámát és a ponthatárok alapján osztályozza le azt!
 */
public class Feltetel6 {
	public static void main(String[] args) throws IOException {
		int x;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("A dolgozat pontszáma: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		
		
		
		if (x >= 0 && x <= 50) {
			
			System.out.println("Az érdemjegy: 1");

			}
		 
		else if (x >= 51 && x <= 65){
			System.out.println("Az érdemjegy: 2");


			}
		else if (x >= 66 && x <= 75){
			System.out.println("Az érdemjegy: 3");


			}
		else if (x >= 76 && x <= 85){
			System.out.println("Az érdemjegy: 4");


			}
		else if (x >= 86 && x <= 100){
			System.out.println("Az érdemjegy: 5");


			}
		else {
			System.out.println("Hibás adat!");
		}
		
	}

}
