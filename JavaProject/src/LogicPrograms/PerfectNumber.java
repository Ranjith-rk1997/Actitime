package LogicPrograms;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 7;
		int sum=1;
		int temp=num;
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==temp)
			System.out.println("It is a perfect number");
		else
			System.out.println("not a perfect number");
	}

}
