// Változók beolvasása
import java.io.*;
public class Olvas {
	public static void main (String[] args) throws IOException
	{
		BufferedReader be=new BufferedReader
				(new InputStreamReader(System.in));
		System.out.print("i = ");
		int i =Integer.valueOf(be.readLine()).intValue();
		System.out.print("a = ");
		double a =Double.valueOf(be.readLine()).doubleValue();
		System.out.println("egesz adat: " + i + "\nvalos adat: " + a);
	}
}
