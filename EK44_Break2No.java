import java.io.*;


/*
 * Készítsünk programot, amely megkeresi az első, 10 és 20 közé eső Pitagoraszi számhármast!
 * Break nélküli megoldás.
 */
public class EK44_Break2No {
	
	public static void main (String[] args) throws IOException {
		
		
		int a = 0, b = 0;
		double c = 0;
		
		boolean talalt = false;
		
				
			for (a=10; a<20 && !talalt; a++) {
				for (b=a+1; b<20 && !talalt; b++) {
					c = Math.sqrt(a*a+b*b);
					if ((c-(long)c)<1e-6) {
						talalt = true;
					
					}
				}
				
				
				
			}
			if (talalt) {
				System.out.println("" + (a-1) + ", " + (b-1) + ", " + c);
			}
			else {
					System.out.println("nincs Pitagoraszi számhármas.");
			}
					// EZ ÍGY MÁR MŰKÖDIK!!!
		
	}
	
}