package operators;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("before swapping value:"+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping value:"+x+" +y");
		sc.close();
	}
}

		
		
				


	}

}
