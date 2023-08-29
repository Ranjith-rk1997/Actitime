package Array;

import java.util.Scanner;

public class Merge {

	
	
		public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String a = sc.nextLine();
		System.out.println("Enter the String :");
		String b = sc.nextLine();
		boolean c = isAnagram(a,b);
		if(c)
		System.out.println("Anagram");
		else
		System.out.println("Not Anagram");
		}
		
		
		
		
		static int[] countAlpha(String s){
		int count[] = new int[26];
		for(int i=0;i<s.length();i++){
		char ch = s.charAt(i);
		  if(ch>='A'&&ch<='Z')
		    count[ch-65]++;
		  else if(ch>='a'&&ch<='z')
		    count[ch-97]++;
		}
		return count;
		}
		
		
		
		
		
		static boolean isAnagram(String a,String b){
		int s1[] = countAlpha(a);
		int s2[] = countAlpha(b);
		  for(int i=0;i<26;i++){
		if(s1[i]!=s2[i])
		  return false;
		}
		return true;
		}
		}



