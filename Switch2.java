import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * olvassa be a program a dolgozat pontszámát és a ponthatárok alapján osztályozza le azt!
 */
public class Switch2 {
	public static void main(String[] args) throws IOException {
		int pontszam, erdemjegy = 0;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("A dolgozat pontszáma: ");
		pontszam = Integer.valueOf(be.readLine()).intValue();
		
		
		
		
		if (pontszam >= 0 && pontszam <= 50) {
			erdemjegy = 1;

			}
		 
		else if (pontszam >= 51 && pontszam <= 65){
			erdemjegy = 2;


			}
		else if (pontszam >= 66 && pontszam <= 75){
			erdemjegy = 3;


			}
		else if (pontszam >= 76 && pontszam <= 85){
			erdemjegy = 4;


			}
		else if (pontszam >= 86 && pontszam <= 100){
			erdemjegy = 5;


			}
		
		
		else {
			System.out.println("Hibás adat!");
		}
		switch (erdemjegy) {
		case 1:
			System.out.println("Az érdemjegy: 1");
			break;
		case 2:
			System.out.println("Az érdemjegy: 2");
			break;
		case 3:
			System.out.println("Az érdemjegy: 3");
			break;
		case 4:
			System.out.println("Az érdemjegy: 4");
			break;
		case 5:
			System.out.println("Az érdemjegy: 5");
			break;
		
		}
		
		
	}

}
