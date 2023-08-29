package Array;

public class SumOfDigits {

	public static void main(String[] args) {
		int a[] = {23,45,67,89,96,82,64};
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			while(a[i]!=0) {
				int n=a[i]%10;
				sum=sum+n;
				a[i]=a[i]/10;
			}
			a[i]=sum;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
