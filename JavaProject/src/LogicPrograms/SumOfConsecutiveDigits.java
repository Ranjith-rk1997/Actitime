package LogicPrograms;

public class SumOfConsecutiveDigits {

	public static void main(String[] args) {
		int num = 564387;
		int sum=0;
		while(num>=10) {
			int n=num%100;
			sum=sum+n;
			num=num/10;
		}
		System.out.println(sum);
	}

}
