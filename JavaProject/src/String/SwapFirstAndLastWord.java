package String;

import java.util.Scanner;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String s = sc.nextLine();
			String r = "";
			char ch[] = s.toCharArray();
			String fch ="",mch=""; StringBuilder lch=new StringBuilder();
			int fi=0;
			int li=ch.length-1;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' '){
			         fch+=ch[i];
			         fi++;
				}
				else {
					break;
				}
			}
			while(ch[li]!=' ') {
				lch.append(ch[li]);
				li--;
			}
			for(int i=fi;i<=li;i++) {
				mch+=ch[i];
			}
			System.out.println(lch.reverse()+mch+fch);
	     	}
	}


