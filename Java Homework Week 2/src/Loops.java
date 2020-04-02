
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//5A.
			int i = 0;
			
			while (i < 51) {
				System.out.println(i * 2);
				i++;
			}
			
		//5B.
			int x = 100;
			
			while (x >= 0) {
				System.out.println(x);
				x-= 3;
			}
			
		//5C.
			for (int y = 1 ; y <= 100; y+= 2) {
				System.out.println(y);
			}
			
		//5D.
			for (int z = 0; z <= 100; z++) {
				
				if (z % 3 == 0 && z % 5 == 0) {
					System.out.println("Hello World");
				} else if (z % 3 == 0) {
					System.out.println("Hello");
				} else if (z % 5 == 0) {
					System.out.println("World");
				} else {
					System.out.println(z);
				}
		
		
		}
				

		
	}

}
