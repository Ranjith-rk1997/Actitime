package Array;

public class Frequency {

	public static void main(String[] args) {
	int a[] = {12,23,34,56,23,12,67};
	for (int i = 0; i < a.length; i++) {
		int count=1;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=0;
			}
		}
		if(a[i]!=0)
		System.out.println(a[i]+"------>"+count);
	}
	}
}
