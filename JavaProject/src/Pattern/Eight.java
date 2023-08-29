package Pattern;

public class Eight {

	public static void main(String[] args) {
	int num=5;
	for (int i = 1; i <=num; i++) {
		for (int j =num-i; j>=0; j--) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}

	}

}
