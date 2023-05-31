package day8;
import java.util.*;
import java.util.LinkedHashSet;
public class LinkedHashSets {

	public static void main(String[] args) {
	LinkedHashSet<Integer>sc=new LinkedHashSet<Integer>();
	sc.add(12);
	sc.add(2);
	sc.add(34);
	sc.add(100);
	System.out.println(sc);
	sc.removeAll(sc);
	System.out.println(sc);
//	Iterator i=sc.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
	for(Integer od:sc)
	{
		System.out.println(od);
	}
	
	}

}
