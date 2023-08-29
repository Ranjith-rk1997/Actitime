package Array;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {9,10};
		int b[] = {11,22,33};
		int c[] = new int[a.length+b.length];
		int i =0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
						k++;
						i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
			while(i<a.length) {
				c[k]=a[i];
				k++;
				i++;
			}
			while(j<b.length) {
				c[k]=b[j];
				k++;
				j++;
			}
			for (int k2 = 0; k2 < c.length; k2++) {
				System.out.print(c[k2]+" ");
			}
		}
		

	}


