package Array;

public class Prime {
	public static void main(String[] args) {
		int a[] = {23,4,8,7,11,5,1,0};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1) {
				System.out.println(a[i]+" prime strts from 2");
				break;
			}
			for (int j = 2; j <=a[i]/2; j++) {
				
				if(a[i]%j==0) {
					System.out.println(a[i]+"is not prime");
					break;
				}
				else {
					System.out.println(a[i]+" Is prime");
					break;
				}
		}
	}
}}

