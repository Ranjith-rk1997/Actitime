package Pattern;

public class ThirtyOne {

	public static void main(String[] args) {
		int row=5;
		for (int i = row; i >=1; i--) {
			for (int j = i; j <=row; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
