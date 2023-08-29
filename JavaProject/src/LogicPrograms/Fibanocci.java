package LogicPrograms;

public class Fibanocci {
public static void main(String[] args) {
	int a=0,b=1,c,num=10,count=0;
	while(count<num) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		count++;
	}
	System.out.println();
	System.out.println("The total count is : "+count);
	int x=0,y = 1;
	for (int i = 0; i < num; i++) {
		int z=x+y;
		System.out.print(z+" ");
		x=y;
		y=z;
		
	}
	
}
}
 