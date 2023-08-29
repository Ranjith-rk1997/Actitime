package Array;

public class AccessIndexValue {

	public static void main(String[] args) {
		int num = 154367;
		int dig=4;
		int n=0;
		while(dig!=0) {
			n=num%10;
			dig--;
			num=num/10;
		}
		System.out.println(n);
	}

}
