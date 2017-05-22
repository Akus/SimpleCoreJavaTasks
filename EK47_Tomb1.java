import java.io.*;


/*
 * Írjunk programot, amely 1-10 közötti véletlen számmal feltölt egy ötelemű, egész típusú tömböt!
 * Számítsuk ki az elemek összegét és átlagát!
 */
public class EK47_Tomb1 {
	
	public static void main (String[] args) throws IOException {
		
		int osszeg = 0;
		double atlag;
		
		int [] x = new int [5];
		
		System.out.println("A tömb elemei: ");
		
		for (int i = 0; i < x.length; i++) {
			x[i] = (int)(10*Math.random()+1);
			System.out.println(x[i]);
			
			osszeg += x[i];
		}
		atlag = (double)osszeg/x.length;
		System.out.println("Összeg: " + osszeg);
		System.out.println("Átlag: " + atlag);
		
	}
	
}