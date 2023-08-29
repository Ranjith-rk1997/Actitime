package LogicPrograms;

public class StrongNumber {
	public static void main(String[] args) {
		int num =145,temp=num,total=0;
		while(num!=0) {
			int n=num%10,fact=1;
			while(n!=0) {
				fact=fact*n;
				n--;
			}
			num=num/10;
			total=total+fact;
		}
if(temp==total)
	System.out.println("Perfect Number");
else
	System.out.println("not a perfect number");
	}

}
