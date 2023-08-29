package String;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Grab";
		String s2 = "brag";
		boolean b = isAnagram(s1,s2);
		if(b)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	}
	static boolean isAnagram(String s1, String s2) {
		int a[] = countString(s1);	
		int b[] = countString(s2);
		for (int i = 0; i < 26; i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	public static int[] countString(String s) {
		int a[] = new int[26];
		s=s.toUpperCase();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
				a[ch[i]-65]++;
		}
		return a;
	}}