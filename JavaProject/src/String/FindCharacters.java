package String;
import java.util.Scanner;
public class FindCharacters {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The String : ");
	String s =sc.next();
	int vo=0,co=0,sp=0,no=0;
	char ch[] = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if((ch[i]=='A')||(ch[i]=='a')||(ch[i]=='E')||(ch[i]=='e')||(ch[i]=='I')||(ch[i]=='i')||(ch[i]=='O')||(ch[i]=='o')||(ch[i]=='U')||(ch[i]=='u')){
			vo++;
			System.out.println(ch[i]+" Is a vowel");
		}
		else if((ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='a'&&ch[i]<='z')) {
			co++;
			System.out.println(ch[i]+" is a consonent");
		}
		else if(ch[i]>='0'&&ch[i]<='9') {
			no++;
			System.out.println(ch[i]+" is a number");
		}
		else {
			sp++;
			System.out.println(ch[i]+" is a special character");
		}
	}
	System.out.println("Vowels count is :"+vo);
	System.out.println("Special character count is :"+sp);
	System.out.println("Consonents count is :"+co);
	System.out.println("Numbers count is :"+no);
	}
}
