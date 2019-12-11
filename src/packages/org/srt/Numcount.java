package packages.org.srt;

public class Numcount {
	public static void main(String[] args) {
		String a="WelComeToJava";
		int upper=0,lower=0;
		char c1=' ';
		char c2=' ';
		
		String s1="";
		String s2="";
		String s3="";
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='A'&& ch<='Z') {
				upper++;
				c1=ch;
				String a1 = Character.toString(c1);
				 s2 = a1.toLowerCase();
				System.out.println("upper "+c1);
				System.out.println("upper converted into lower "+s2);
				s2=s2.concat("");
				
				
			}else if(ch>='a' && ch<='z') {
				lower++;
				c2=ch;
				String a2 = Character.toString(c2);
				 s3 = a2.toUpperCase();
				System.out.println("lower "+c2);
				System.out.println("lower converted into upper "+s3);
				s3=s3.concat("");
			}
			
		}
		
		s1=s2.concat(s3);
		
		System.out.println("upper count is"+upper);
		System.out.println("lower count is"+lower);
		
		System.out.println("output is :"+s1);
	}

}