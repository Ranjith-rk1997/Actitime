package LogicPrograms;
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num = sc.nextInt(); 
		while(num>9) {
			int sum=0;
		 while(num!=0) {
			int n= num%10;
			int prod=n*n;
			sum=sum+prod;
			num=num/10;
			}
		 num = sum;
		}
		if(num==1||num==7)
			System.out.println("happy number");
		else
			System.out.println("not happy number");
		sc.close();
	}
}
