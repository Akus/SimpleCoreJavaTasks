import java.io.*;


/*
 * Írjunk programot, amely 1-10 közötti véletlen számmal feltölt egy 10 elemű, egész típusú tömböt!
 * Keressük meg a tömb legnagyobb és legkisebb elemét!
 */
public class EK50_Tomb4 {
	
	public static void main (String[] args) throws IOException {
		
		int paros_db = 0, paratlan_db = 0;
		
		int [] x = new int [10];
		
		System.out.println("A tömb elemei: ");
		
		for (int i = 0; i < x.length; i++) {
			x[i] = (int)(10*Math.random()+1);
			System.out.println(x[i]);
			
		}
		
		int min_adat = x[0], max_adat = x[0];
		for (int i = 1; i < x.length; i++) { // miért 1-től indul az i???
			if (x[i] < min_adat) {
				min_adat = x[i];
			}
			if (x[i] > max_adat) {
				max_adat = x[i];
			}
		}
		
		
		System.out.println("A tömb legkisebb eleme: " + min_adat);
		System.out.println("A tömb legnagyobb eleme: " + max_adat);
		
	}
	
}