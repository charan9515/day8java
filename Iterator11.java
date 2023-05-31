package day8;

import java.util.ArrayDeque;
import java.util.Iterator;
public class Iterator11 {

	public static void main(String[] args) {
		ArrayDeque<Integer> ab=new ArrayDeque<Integer>();
		ab.add(1);
		ab.add(245);
		ab.add(12);
		ab.add(0);
		System.out.println(ab);
		Iterator abc=ab.iterator();
		while(abc.hasNext()) {
			System.out.println(abc.next());
		// TODO Auto-generated method stub

	}
		
	}
}
