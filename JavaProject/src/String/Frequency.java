package String;

public class Frequency {

	public static void main(String[] args) {
		String s = "ranjith kumar";
		int a[] = new int[27];
		s = s.toUpperCase();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ')
				a[ch[i]-6]++;
			else
				a[ch[i]-65]++;
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			System.out.println((char)(i+65)+"----->"+a[i]);
		}
	}
}
