package day8;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Iterator;
public class Queueim {

	public static void main(String[] args) {
//	Queue implementation->it is fifo property.ex:tickets booking in a line
//		1.arraydequeue :double end queue.we can remove element from two ends.but we can only insertfrom one end only
//		2.linkedlist :
//		3.priorityqueue:
		ArrayDeque sc=new ArrayDeque();
//		ArrayDeque sc1=new ArrayDeque();
		sc.add(1);
		sc.add("charan");
		sc.add("cbit");
		System.out.println(sc);
		sc.clear();
		System.out.println(sc);
		sc.addFirst("cbit");
		System.out.println(sc);
		sc.addLast("1");
		System.out.println(sc);
		System.out.println(sc);
		sc.offerLast(1);
		System.out.println(sc);
		
		}
	}


