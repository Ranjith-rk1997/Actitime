  package Array;

public class DeleteElement {

	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int b[] = new int[a.length-1];
	int in = 3;
	for (int i = 0; i < b.length; i++) {
		if(i<in)
			b[i]=a[i];
		else
			b[i]=a[i+1];
	}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	}

}
