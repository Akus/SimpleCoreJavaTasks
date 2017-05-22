// Precedencia-szabály
public class Prec3 {
	public static void main(String[] args) {
		double a = 3, b = 5, c = 12, d = 10, e = 2, ered1, ered2;
		ered1 = a + b * c / (d * e);
		ered2 = a + b * c / d / e;
		System.out.println("Eredmeny1: " + ered1);
		System.out.println("Eredmeny2: " + ered2);
	}
}
