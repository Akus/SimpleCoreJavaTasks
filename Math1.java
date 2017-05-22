/*
 * Írjunk programot, amelyben kiszámítjuk az egységsugarú kör területét és kerületét!
 */
public class Math1 {
	public static void main(String[] args) {
		double sugar = 1, Korter, Korker;
		Korter = Math.pow(sugar, 2) * Math.PI;
		Korker = 2 * sugar * Math.PI;
		System.out.println("Kor terulete: " + Korter);
		System.out.println("Kor kerulete: " + Korker);

	}

}
