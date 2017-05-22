// Karakter beolvasása
import java.io.*;
public class Olvas2 
{
	public static void main (String[] args) throws IOException 
	{
		int kar1, kar2;
		char ckar1, ckar2;
		System.out.print("2 karakter =");
		kar1 = System.in.read();
		ckar1 = (char)kar1;
		kar2 = System.in.read();
		ckar2 = (char)kar2;
		System.out.println("Beolvasott karakterek: " + ckar1 + ckar2);
		System.out.println("Karakter: " + ckar1 + "kodja: " + kar1);
		System.out.println("Karakter: " + ckar2 + "kodja: " + kar2);

	}
}
