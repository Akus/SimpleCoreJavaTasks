
public class While1 {
public static void main(String[] args) {
	int osszeg = 0, szorzat = 1;
	int i = 0;
	while (i < 10) {
		if (i % 2 == 0) {
			osszeg += i;
		}
		else {
			szorzat *= i;
		}
		i++;
		
	}
	System.out.println("páros számok összege 10-ig: " + osszeg);
	System.out.println("páratlan számok szorzata 10-ig: " + szorzat);

}
}
