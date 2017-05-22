import java.io.*;


/*
 * Írjunk alkalmazást, amelyben egy for cilusba ágyazott switch utasításban használjuk
 *  a break és continue utasításokat!
 */
public class EK43_Break3 {
	
	public static void main (String[] args) throws IOException {
		
		ciklus: for (int a=0; a<7; a++) {
					switch (a) {
						case 2:
							System.out.println("switch break: " + a);
							break;
						case 1: case 3:
							System.out.println("for continue: " + a);
							continue ciklus; // mint a continue
						case 5:
							System.out.println("for break: " + a);
							break ciklus; // kilépünk a ciklusból, 6-os már le se fut.
						default:
							System.out.println("switch default: " + a);
							
					}
					System.out.println("" + a);
		}
		
		
	}
	
}