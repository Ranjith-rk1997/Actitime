package LogicPrograms;
import java.util.Scanner;
public class PrimeWithInN {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the starting value : ");
	int num = sc.nextInt();
	System.out.print("Enter the end value : ");
	int end = sc.nextInt();
	for (int i = num; i <= end; i++) {
		int count=1;
		for (int j = 2; j <= i/2; j++) {
			if (i%j==0) 
				count++;	
		}
		if(count>1)
			System.out.println(i+" is not a prime number");
		else
			System.out.println(i+" is a prime number");
	}
	sc.close();
	}
}
