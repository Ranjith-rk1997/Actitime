package Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		char a[] = {'a','a','b','b','v','c','a'};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					a[j]=0;
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			System.out.print(a[i]+" ");
		}
	
//		String s="sanjeev kumar";
//		StringBuffer s1=new StringBuffer(s);
//		System.out.println(s1.reverse()); 
//		s1.
//		s.
	}

}
