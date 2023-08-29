package String;

public class EqualParts {

	public static void main(String[] args) {
		String s = "1234567890";
		int temp = 0, n = 5, len = s.length(), part = len/n; 
		String arr[] = new String[n];
		
		if(len%n!=0)
			System.out.println("Not possible");
		else
			for (int i = 0; i < len; i=i+part) {
				arr[temp] = s.substring(i,i+part);
				temp++;
			}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
