package packages.org.next;

import java.util.*;
import java.util.Map.Entry;

public class Sam2 {
	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "hadoop");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.keySet());
		System.out.println(m.values());
		Set<Entry<Integer,String>>h=m.entrySet();
		for(Entry<Integer,String>p:h) {
			System.out.println(p);
			
		}
		for(Entry<Integer,String>p:h) {
			
			System.out.println(p.getKey());
			System.out.println(p.getValue());
			
		
	
	}

}
}
