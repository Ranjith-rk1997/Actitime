package Array;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a[] = {2,5,7,11,34,56,77};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				count++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("count is : "+count);
}
	 static boolean isPrime(int i) {
		for (int j = 2; j <=i/2; j++) {
			if(i%j==0) 
				return false;			
		}
		return true;
	}
}
