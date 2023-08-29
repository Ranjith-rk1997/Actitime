package String;

public class RemoveRepeated {

	public static void main(String[] args) {
	String s = "java";
	char ch[] = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		boolean repeated = false;
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j])
				repeated = true;
		}
		if(!repeated)
			System.out.print(ch[i]);
	}
	

	}

}
