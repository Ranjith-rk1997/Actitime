package LogicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count=0;
		for (int i = 2; i<=num/2; i++) {
			if (num%i==0) {
				count++;
			break;
			}
		}    
		
		if(count>0)
			System.out.println("The number is not a prime number");
		else
			System.out.println("Prime Number");
		sc.close();
	}  
}
