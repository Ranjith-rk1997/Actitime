package String;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		String r = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		int f=i;
		while(i<ch.length&&ch[i]!=' ') {
			i++;
		}
		int j=i-1;
		while(j>=f) {
			r=r+ch[j];
			j--;
		}
		if(i<ch.length)
			r=r+ch[i];
		}
		System.out.println(r);
	}
}
