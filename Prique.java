package day8;
import java.util.PriorityQueue;
public class Prique {

	public static void main(String[] args) {
		PriorityQueue<Integer> sc=new PriorityQueue<Integer>();
		sc.add(50);
		sc.add(5);
		sc.add(60);
		sc.add(0);
		System.out.println("priority q:"+sc);
		System.out.println("for each loop:");
		for(Integer pri:sc) {
			System.out.println(pri);
		}
		System.out.println("peek value:");
		sc.peek();
		System.out.println(sc.peek());
		System.out.println("contains value:");
		sc.contains(100);
		System.out.println(sc.contains(100));
		System.out.println("sorted order:");
		while(!(sc.isEmpty())) {
			System.out.println(sc.poll());
		}
		PriorityQueue<String> cc=new PriorityQueue<String>();
		cc.offer("charan");
		cc.offer("CBIT");
		cc.offer("proddatur");
		System.out.println(cc);
		cc.remove();
		System.out.println(cc);
		cc.clear();
		System.out.println(cc);
		
		

	}

}
