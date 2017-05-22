import java.io.*;


/*
 * Jelenítsük meg a 7x7-es szorzótábla főátló alatti részét!
 */
public class EK46_Continue1No {
	
	public static void main (String[] args) throws IOException {
		final int N = 7;
		
		boolean kulso;
				
		for (int i=1; i <= N; i++) {
					kulso = false;
					for (int j=1; j <= N && !kulso; j++) {
						if (j<=i) {
							System.out.print("\t" + i*j);
						}
						else {
							System.out.println();
							kulso = true;
						}
					}
			}
		
	}
	
}