package packages.org.srt;

import java.util.Scanner;

public class sam5 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter email");
	String a = s.nextLine();
	if(a.contains("pincode")) {
		System.out.println(a);
	}else {
		System.exit(0);
	}
	String d = a.replaceAll("pincode", " ");
	System.out.println(d);
	}

}
