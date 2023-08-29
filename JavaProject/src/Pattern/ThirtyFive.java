package Pattern;

public class ThirtyFive {

	public static void main(String[] args) {
		int row=5;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=row-i; j++) {
				System.out.print(" ");
			}
			int k = 1;
			for (int j = 1; j <=2*i-1; j++) {
				if(j%2==1) {
					System.out.print(k);
					k++;
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
