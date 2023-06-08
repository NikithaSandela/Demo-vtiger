package bookmyshow;

import java.util.Scanner;

public class Bookmyshow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String username=sc.nextLine();
		System.out.println("enter phn num");
		String phn=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("book my show account created succesully");
		Bookmyshow n=new Bookmyshow();
		n.login();
		n.MovieTheaters("PVR");
		Bookmyshow.MovieSelection("MAJOR");
	}
public void login()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user name");
	String username=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	if(username.equals("ni")&& password.equals("ni@98")) {
		
		System.out.println("bookmyshow loggin successfully");
}
	else
	{
		System.out.println("invalid crediantals");
	}
	
}
	public static void MovieSelection(String Movie)
	{
	if (Movie.equals("MAJOR")  || Movie.equals("SITARAMA") || Movie.equals("NENUEYRAJUNENUEYMANTHRI"))
	{
	System.out.println(Movie + " movie Selected");
	}
	else
	{
	System.out.println(Movie + " Movie Not available in the List");
	}
	}
	public void MovieTheaters(String Theaters)
	{
	if (Theaters.equals("INOX")  || Theaters.equals("PVR") || Theaters.equals("JVR"))
	{
	System.out.println( Theaters+ " Theater Selected");
	}
	else
	{
	System.out.println(  Theaters+" Theater Not available in the List");
	}
}
	public static void seatselection() {
		int C1;
		int seatnumber= C1;
		switch(seatnumber){
			case1:seatnumber= A1;
			
			
				
		}
		
		
		
		
	}
}
