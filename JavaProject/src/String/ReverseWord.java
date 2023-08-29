package String;

public class ReverseWord {

	public static void main(String[] args) {
		String s = new String("ranjith");
		char ch[] = s.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String r = new String(ch);
		System.out.println(r);
	}

}
