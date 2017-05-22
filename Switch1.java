
public class Switch1 {
public static void main (String[] args) {
	char jel;
	double a, b, ered;
	jel = '-';
	a = 3;
	b = 7;
	switch (jel) {
	case '+':
		ered = a + b;
		System.out.println(a + " + " + b + " = " + ered);
		break;
	case '-':
		ered = a - b;
		System.out.println(a + " - " + b + " = " + ered);
		break;
	}
}
}
