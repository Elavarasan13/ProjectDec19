package packages.org.srt;

import java.util.Scanner;

public class Strg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String a = sc.next();
		System.out.println(a);
		if(a.length()<=10) {
			System.out.println("valid num");
			
		}else {
			System.out.println("invalid num");
		}
	}

}
