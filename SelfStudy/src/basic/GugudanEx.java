package basic;

public class GugudanEx {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			

			for (int j = 2, k=2; j < 10; k++, j++) {
				
				//System.out.print("["+k+"´Ü]");
				
				System.out.print(j + "*" + i + "=" + String.format("%3d", j* i));
				System.out.print("    ");
				
			}
			System.out.println();
		}
	}
}