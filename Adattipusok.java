// Adattipusok
public class Adattipusok {
	public static void main(String[] args) {
		boolean igaz, hamis;
		char karakter, csillag, szamjegy;
		byte b_szam;
		short s_szam;
		int i_szam;
		long l_szam;
		float f_szam;
		double d_szam;
		igaz = true;
		hamis = false;
		karakter = 'a';
		csillag = '*';
		szamjegy = '5';
		b_szam = 127;
		s_szam = 32767;
		i_szam = 2147483;
		l_szam = 217452345;
		f_szam = 1.237F;
		d_szam = 3.123E4;
		
		final char UJS = '\n';
		
		System.out.println(karakter + "\n" + csillag + "\n" + szamjegy + "\n" + b_szam);
	}
}
