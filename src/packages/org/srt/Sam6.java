package packages.org.srt;

import java.util.Scanner;

public class Sam6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int a = s.nextInt();
		
	if( a==1||a==2) {
		System.out.println("prime number");
		System.exit(0);
	}
	for(int i=2;i<=a;i++) {
		if(i!=a) {
			if(a%i==0) {
				System.out.println("not a prime");
				break;
			}
		}else {
			System.out.println("prime num");
		}
	}
}
}