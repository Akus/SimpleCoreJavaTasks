import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While2 {
public static void main(String[] args) throws IOException {
	int dobas, dobasok_szama, db_1 = 0, db_2 = 0, db_3 = 0, db_4 = 0, db_5 = 0, db_6 = 0;
	
	BufferedReader be=new BufferedReader
			(new InputStreamReader(System.in));
	System.out.print("Dobások száma = ");
	dobasok_szama =Integer.valueOf(be.readLine()).intValue();
	
	int i = 0;
	while (i < dobasok_szama) {
		dobas = (int) (Math.random() * 6) + 1;
		
		switch (dobas) {
		case 1: db_1++; break;
		case 2: db_2++; break;
		case 3: db_3++; break;
		case 4: db_4++; break;
		case 5: db_5++; break;
		case 6: db_6++; break;
		
		}
		i++;
	}
	
	
	System.out.println("1 dobása: " + db_1);
	System.out.println("2 dobása: " + db_2);
	System.out.println("3 dobása: " + db_3);
	System.out.println("4 dobása: " + db_4);
	System.out.println("5 dobása: " + db_5);
	System.out.println("6 dobása: " + db_6);



}
}
