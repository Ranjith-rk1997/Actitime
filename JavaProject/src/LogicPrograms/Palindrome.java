package LogicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int n = 232;
		boolean rs = isPalindrome(n);
		if(rs)
			System.out.println("the number is palindrome");
		else
			System.out.println("not palindrome");
	}
	public static boolean isPalindrome(int x) {
		int rev=0,temp=x;
		while(x!=0) {
			int n = x%10;
			rev=rev*10+n;
			x=x/10;
		}
		return rev==temp;
	}

}
