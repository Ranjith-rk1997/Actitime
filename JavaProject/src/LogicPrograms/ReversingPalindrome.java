 package LogicPrograms;

public class ReversingPalindrome {
	public static void main(String[] args) {
		int num = 156651,temp=num,rev=0;
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;                                                                                                 
		}
		if(temp==rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		System.out.println(rev);
	}
}
