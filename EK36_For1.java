
public class EK36_For1 {
public static void main (String[] args) {
	int db = 0;
	int osszeg = 0, szorzat = 1;
	double gyok, atlag;
	
	for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
			osszeg += i;
			db++;
		}
		else {
			szorzat *= i;
		}
	}
	atlag = (double)osszeg/db;
	gyok = Math.sqrt(szorzat);
	System.out.println("Paros szamok osszege 10-ig: " + osszeg);
	System.out.println("Paros szamok atlaga 10-ig: " + atlag);
	System.out.println("Páratlan szamok szorzata 10-ig: " + szorzat);
	System.out.println("Páratlan szamok szorzatának gyöke 10-ig: " + gyok);

}
}
