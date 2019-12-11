package packages.org.srt;

public class Sample1 {
	public static void main(String[]args) {
		String s="elaa";
		String s1="dev";
		System.out.println("immutable string");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String d=s.concat(s1);
		System.out.println(System.identityHashCode(d));
		StringBuffer s2=new StringBuffer("elaa");
		StringBuffer s3=new StringBuffer("dev");
		StringBuffer s4=new StringBuffer("ack");
		System.out.println("muttable string");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		StringBuffer a=s2.append(s3);
		System.out.println(System.identityHashCode(a));
		StringBuffer b=a.append(s4);
		System.out.println(System.identityHashCode(b));
		
	}

}
