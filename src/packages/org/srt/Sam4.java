package packages.org.srt;

import java.util.Scanner;

public class Sam4 {
	public static void main(String[] args) {
	String regex="^[0-9]*$";
	Scanner s=new Scanner(System.in);
	System.out.println("enter string 1");
	String phno = s.next();	
	if(phno.matches(regex)) {
		System.out.println("Valid Phone");
	}else {
		System.out.println("Invalid Phone");
	}
	}

}
