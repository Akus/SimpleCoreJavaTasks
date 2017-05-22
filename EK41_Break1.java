import java.io.*;


/*
 * Készítsünk programot, amelyben cikluson és switch utasításon kívül használjuk a címkézett break utasítást!
 */
public class EK41_Break1 {
	
	public static void main (String[] args) throws IOException {
		
		
		boolean kilep = false;
		
		ablokk: {
			System.out.println("A-blokk eleje");
			bblokk: {
				System.out.println("B-blokk eleje");
				cblokk: {
					System.out.println("C-blokk eleje");
					if (kilep) {
						break bblokk;
					}
					System.out.println("C-blokk vége");
				}
				System.out.println("B-blokk vége");
			}
			System.out.println("A-blokk vége");

			/*
			 * Ha kilep = true -->
			 * 		A-blokk eleje
					B-blokk eleje
					C-blokk eleje
					A-blokk vége
			 */
			
		}
		
	}
	
}