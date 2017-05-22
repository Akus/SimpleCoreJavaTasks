import java.io.*;


/*
 * Készítsünk programot, amely megkeresi az első, 10 és 20 közé eső Pitagoraszi számhármast!
 */
public class EK42_Break2 {
	
	public static void main (String[] args) throws IOException {
		
		
		int a = 0, b = 0;
		double c = 0;
		
		boolean talalt = false;
		
		megvan: 
			// a break utasítással a külső ciklusból is kilépünk.
			
			for (a=10; a<20; a++) {
				for (b=a+1; b<20; b++) {
					c = Math.sqrt(a*a+b*b);
					if ((c-(long)c)<1e-6) {
						talalt = true;
						break megvan;
					}
				}
				
				if (talalt) {
					System.out.println("" + a + ", " + b + ", " + c);
				}
				else {
						System.out.println("nincs Pitagoraszi számhármas.");
				}
				
			}
					// EZ ÍGY NEM MŰKÖDIK!!!
		
	}
	
}