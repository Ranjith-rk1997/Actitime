package LogicPrograms;
import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double i = 1, count =0;
		while(i*i<=n) {
			i++;
			count++;
		}
		System.out.println(count);
	}
}  					 
