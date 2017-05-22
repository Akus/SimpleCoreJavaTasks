import java.io.*;


/*
 * Írjunk programot ami egy pozitív 2-nél nagyobb számnak megkeresi az osztóit, 
 * illetve kijelzi, ha a szám prímszám!
 */
public class EK38_DoWhile2 
{
public static void main (String[] args) throws IOException 
	{
	
	int szam, fele, db = 0;
		
	BufferedReader be=new BufferedReader
			(new InputStreamReader(System.in));
	do {
		System.out.println("Pozitív egész szám (>2): ");
		szam =Integer.valueOf(be.readLine()).intValue();

		}
	while (szam <= 2);
	
	if (szam > 2) 
		{
		fele = szam/2;
		System.out.println("Fele: " + fele);

		System.out.println("Osztoi: ");
		for (int oszto = 2; oszto <= fele; oszto++)
			{
			if (szam % oszto == 0) 
				{
				System.out.println(oszto);
				db++;
				}
			}
		}
	if (db == 0) 
		{
		System.out.println("Primszam");
		}
	}
}