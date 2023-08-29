package Pattern;

public class ThirtyFour {

	public static void main(String[] args) {
		int row=5;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=row-i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >=1; j--) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

	}

}
