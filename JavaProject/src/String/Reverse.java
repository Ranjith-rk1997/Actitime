package String;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		String s= sc.nextLine();

			
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
//				
//		System.out.println();
//			
//		char ch[] = s.toCharArray();
//		for (int i =ch.length-1; i>=0; i--) {
//			System.out.print(ch[i]);
//		int []a= {1,2,3,4,5,6};
//		int []j=new int[a.length];
//		for (int j2 = 0, last=a.length-1; j2 < a.length; j2++,last--)
//			j[j2]=a[last];
//			
//		for (int j2 = 0; j2 < a.length; j2++) {
//			System.out.println(j[j2]);
//		}
	  
		//String s="sanjeevkumar";
//		s=s.replace(" ","");
//		System.out.println(s.length());
//	    char ch[]=s.toCharArray();
//	    int size=ch.length-5;
// for (int i = 0; i < size; i++) {
//			System.out.print(ch[i]);
//		}
//	    for (int i =ch.length-1; i>=size; i--) {
//			System.out.print(ch[i]);
//		}
//	   Integer i=1345;
//	   String s1=i.toString();
//	   System.out.println(s1);
//	   char ch[]=s1.toCharArray();
//	   for (int s = 0; s < ch.length; s++) {
//		System.out.println(ch[s]);
//	   
//	   }
//		
//		
//		StringBuilder sc = new StringBuilder(s);
//		sc.reverse();
//		System.out.println(sc);
		
		
