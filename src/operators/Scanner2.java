package operators;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the number");
		int num=x.nextInt();
		if(num>0)
		{
			System.out.println(num+"number is positive");
		}
		else
		{
			System.out.println(num+"number is negative");
		}
		x.close();
	}
}


