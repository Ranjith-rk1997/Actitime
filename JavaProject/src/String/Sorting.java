package String;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		String s = "java";
		char ch[] = s.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j <ch.length; j++) {
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
System.out.println(new String(ch));


//inbuilt method
	String sc = "rajith";
	char c[]  = sc.toCharArray();
	Arrays.sort(c);
	System.out.println(new String(c));
	}
}
