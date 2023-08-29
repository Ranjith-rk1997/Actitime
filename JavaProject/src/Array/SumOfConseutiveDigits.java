package Array;

public class SumOfConseutiveDigits {

	public static void main(String[] args) {
	int num=2346568;
	int temp=num;
	int sum=0, count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	int a[]= new int[count];
	for (int i = a.length-1; i >=0; i--) {
		int r = temp%10;
		a[i]=r;
		temp=temp/10;
	}
	for (int i = 0; i < a.length-1; i++) {
		sum = sum + a[i]*10 + a[i+1];
		System.out.println(sum);
	}
	}

}
