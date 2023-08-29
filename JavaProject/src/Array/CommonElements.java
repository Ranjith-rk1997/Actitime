package Array;

public class CommonElements {

	public static void main(String[] args) {
		int a[] = {23,45,67,25};
		int b[] = {78,76,56,45,23,3};
		int c[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					c[i]=a[i];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if(c[i]!=0)
			System.out.print(c[i]+" ");
		}
	}

}
