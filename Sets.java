package day8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Sets {

	public static void main(String[] args) {
		Set<Integer> sc=new HashSet<Integer>();
		sc.add(1);
		sc.add(2);
		sc.add(7);
		sc.add(4);
		sc.add(6);
		sc.add(0);
		System.out.println(sc);
		System.out.println(sc.hashCode());
		System.out.println("for each loop:");
		for(Integer re:sc) {
			System.out.println(re);
		}
		Iterator i=sc.iterator();
		System.out.println("while loop:");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Set<String> sd=new HashSet<String>();
		sd.add("c");
		sd.add("g");
		sd.add("e");
		sd.add("a");
		System.out.println(sd);
		System.out.println(sd.hashCode());
	}

}
