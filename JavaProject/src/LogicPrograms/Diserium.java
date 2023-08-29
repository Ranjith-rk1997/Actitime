package LogicPrograms;
public class Diserium {
	public static void main(String[] args) {
		int num = 153,temp=num,count=0,sum=0,temp2=temp;
		while(temp2!=0) {
			temp2=temp2/10;
			count++;
		}
		while(num!=0) {
			int n = num%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*n;
			}
			count--;
			num=num/10;
			sum=sum+prod;
		}
		if(sum==temp)
			System.out.println("True");
		else
			System.out.println("false");	
	}
}
