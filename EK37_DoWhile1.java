import java.io.*;


/*
 * Írjunk programot ami a valós alapot pozitív, illetve negatív egész kitevőre emeli!
 */
public class EK37_DoWhile1 
{
public static void main (String[] args) throws IOException 
	{
	
	double alap, hatvany = 1;
	int kitevo, i;
		
	BufferedReader be=new BufferedReader
			(new InputStreamReader(System.in));
	System.out.println("Valós számot emeljünk egész kitevőre");
	System.out.print("Alap: ");
	
	alap =Integer.valueOf(be.readLine()).intValue();
	
	System.out.print("Kitevo: ");
	kitevo =Integer.valueOf(be.readLine()).intValue();
	
	if (kitevo == 0) 
		{
		System.out.println("Hatvany erteke: " + hatvany);
		}
	else 
		{
		i = 1; hatvany = alap;
		do 
			{
			hatvany *= alap;
			i++;
			}
		while ( i < Math.abs(kitevo));
		}
	
	if (kitevo < 0) 
		{
		hatvany = 1./hatvany;
		}
	
		System.out.println("Hatvany erteke: " + hatvany);
		
		
	}
}