import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * olvassa be a program a dolgozat pontszámát és a ponthatárok alapján osztályozza le azt!
 */
public class Feltetel7 {
	public static void main(String[] args) throws IOException {
		int x;
		BufferedReader be = new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("A víz hőmérséklete: ");
		x = Integer.valueOf(be.readLine()).intValue();
		
		
		
		
		if (x <= 0 ) {
			
			System.out.println("A víz halmazállapota: szilárd (jég).");

			}
		 
		else if (x >= 1 && x <= 99){
			System.out.println("A víz halmazállapota: folyékony (víz).");


			}
		else  {
			System.out.println("A víz halmazállapota: légnemű (gőz).");


			}
	}

}
