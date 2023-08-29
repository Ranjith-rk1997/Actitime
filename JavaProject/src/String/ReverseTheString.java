 package String;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		String r = "";
		char ch[] = s.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			int f = i;
			while(i>=0&&ch[i]!=' ') {
				i--;
			}    
			int j=i+1;
			while(j<=f) {
				r=r+ch[j];
				j++;
			}
			if(i>=0)
				r=r+ch[i];
		}
		System.out.println(r);
	}

}
