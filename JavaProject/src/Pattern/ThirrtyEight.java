package Pattern;

public class ThirrtyEight {

	public static void main(String[] args) {
	int row=5,sp=row/2,st=1;
	for (int i = 1; i <=row; i++) {
		for (int j = 1; j <=sp; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=st; j++) {
			System.out.print("*");
		}
		if(i<=row/2) {
			sp--;
			st=st+2;
		}
		else {
			sp++;
			st=st-2;
		}
		System.out.println();
	}
	}

}
