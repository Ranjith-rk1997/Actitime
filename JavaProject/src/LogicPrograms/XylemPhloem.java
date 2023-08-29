package LogicPrograms;

import java.util.Scanner;

public class XylemPhloem {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the value : ");
	int num = sc.nextInt();
	int eSum = 0,mSum = 0;
	eSum = num%10;
	num=num/10;
	while(num!=0) {
		int n = num%10;
		mSum=mSum+n;
		num=num/10;
		if(num<10) {
			eSum=eSum+num;
			break;}
	}
	if(eSum==mSum)
		System.out.println("Xylem");
	else
		System.out.println("phloem");
	sc.close();
	}

}
