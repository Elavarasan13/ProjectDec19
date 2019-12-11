package packages.org.next;

public class Class extends Student{
	public Class() {
		super(20);
		System.out.println("default class");
		
	}
	public Class(int Id) {
		super("guna");
		System.out.println("class id is"+Id);
	}
	public Class(String name) {
		System.out.println("class name is"+name);
	}
	public static void main(String[]args) {
		Class c=new Class();
		Class c1=new Class(15);
		Class c2=new Class("elaa");
		c.method();
		
	}

}
