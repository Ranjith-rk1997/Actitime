package Array;
public class ReverseArray {
	public static void main(String[] args) {
	int a[] = {23,45,67,87,93,64};
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}System.out.println();
	for (int i = a.length-1; i >=0; i--) {
		System.out.print(a[i]+" ");
	}
	}
}
