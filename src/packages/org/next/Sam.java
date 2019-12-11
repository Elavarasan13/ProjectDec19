package packages.org.next;

import java.util.Scanner;

public class Sam {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("pls enter frst strg");
		String s1=s.nextLine();
		System.out.println("-->"+s1);
		/*System.out.println("pls enter sec strg");
		String s2=s.nextLine();
		System.out.println("-->"+s2);*/
		if(s1.contains("z")) {
			System.out.println("yes");
		}else {
			System.out.println("nos");
		}
	}

}
