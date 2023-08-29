package String;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s =sc.nextLine();	
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			count++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}

}
