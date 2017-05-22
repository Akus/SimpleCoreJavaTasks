import java.io.*;


/*
 * Írjunk programot, amely 1-10 közötti véletlen számmal feltölt egy 8 elemű, egész típusú tömböt!
 * Számláljuk meg a tömb páros és páratlan elemeinek számát!
 */
public class EK48_Tomb2 {
	
	public static void main (String[] args) throws IOException {
		
		int paros_db = 0, paratlan_db = 0;
		
		int [] x = new int [8];
		
		System.out.println("A tömb elemei: ");
		
		for (int i = 0; i < x.length; i++) {
			x[i] = (int)(10*Math.random()+1);
			System.out.println(x[i]);
			
			if (x[i] % 2 == 0) {
				paros_db++;
			}
			else {
				paratlan_db++;
			}
		}
		
		
		
		
		System.out.println("Páros számok: " + paros_db);
		System.out.println("Páratlan számok: " + paratlan_db);
		
	}
	
}