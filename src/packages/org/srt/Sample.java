package packages.org.srt;

public class Sample {
	public static void main(String[]args) {
		String s="elaa";
		String s1="elaa";
		System.out.println("literal string");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String s2=new String("elaa");
		String s3=new String("elaa");
		System.out.println("non literal string");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
