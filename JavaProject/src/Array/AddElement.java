package Array;
public class AddElement {
	public static void main(String[] args) {
	int a[] = {1,2,3,4,6,7};
	int in = 4;
	int ele = 5;
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	int b[] = new int[a.length+1];
	for (int i=0; i < b.length; i++) {
		if(in<0||in>a.length) {
			System.out.println("Not possible");
		}
		if(i==in)
			b[in]=ele;
		else if(i<in)	
			b[i]=a[i];
		else {
			b[i]=a[in];
			in++;
			}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	}
}
