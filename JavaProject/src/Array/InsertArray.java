package Array;

public class InsertArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int b[] = {10,11};
		int c[] = new int[a.length+b.length];
		int in = 3;
		for (int i = 0; i < b.length; i++) {
			c[i+in]=b[i];
		}
		for (int i = 0; i < a.length; i++) {
			if(i<in)
				c[i]=a[i];
			else 
				c[i+b.length]=a[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
