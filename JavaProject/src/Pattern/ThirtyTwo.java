package Pattern;

public class ThirtyTwo {

	public static void main(String[] args) {
	int row = 5;
	for (int i = 1; i <=row; i++) {
		int c=i,k=row-1;
		for (int j = 1; j <=i; j++) {
			System.out.print(c+" ");
			c=c+k;
			k--;
		}
		System.out.println();
	}

	}

}
