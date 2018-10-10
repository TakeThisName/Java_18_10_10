
public class elso {

	public static void main(String[] args) {
		// első feladat
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// második f
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// 3. f
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		// 4. f
		int c = 0;
		for (int i = 1; i <= a; i++) {
			
			if (a % i == 0) {
				System.out.println(i+ " osztója a "+a+"-nak");
				c++;
			}
			
		}
		if (c == 2) {
			System.out.println("A szám prímszám");
		}
		
		// 5.f
		String s = args[2];
		int szorzo = Integer.parseInt(args[3]);
		for (int i = 0; i < szorzo; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(s);
			}
			System.out.println("\n");
		}
		
		// 6.f
		
	}

}
