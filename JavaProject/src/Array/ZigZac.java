package Array;

public class ZigZac {

	public static void main(String[] args) {
	int a[] = {23,34,45,67,89};
	int b[] = {11,22,33,44,55,66};
	int c[] = new int[a.length+b.length];
	int k=0,i=0;
	for (; i < a.length&& i<b.length; i++) {
		c[k]=a[i];
		k++;
		c[k]=b[i];
		k++;
	}
	for (; i < a.length; i++) {
		c[k]=a[i];
		k++;
	}
	for (; i < b.length; i++) {
		c[k]=b[i];
		k++;
	}
	for (int m = 0; m < c.length; m++) {
		System.out.print(c[m]+" ");
	}
	}

}
