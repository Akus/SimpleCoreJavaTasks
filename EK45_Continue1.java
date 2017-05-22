import java.io.*;


/*
 * Jelenítsük meg a 7x7-es szorzótábla főátló alatti részét!
 */
public class EK45_Continue1 {
	
	public static void main (String[] args) throws IOException {
		final int N = 7;
		
		kulso: // a külső ciklus újabb iterációját indítjuk.
			for (int i=1; i <= N; i++) {
					
				belso:
					for (int j=1; j <= N; j++) {
						if (j>i) {
							System.out.println();
							continue kulso;
						}
						System.out.print("\t" + i*j);
					}
			}
		
		System.out.println();
	}
	
}