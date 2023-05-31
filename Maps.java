package day8;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
    Map<Integer,String> m=new HashMap();
    m.put(0,"charan");
    m.put(5,"pavan");
    m.put(7,"ramu");
    m.put(3,"siva");
    System.out.println(m);
    
//    traversing map
    Set a=m.entrySet(); //converting to set so that we can traverse//
    Iterator i=a.iterator();
    while(i.hasNext()) {
    	//converting to map entry so that we can get key and value separately//
    	
    	Map.Entry ent=(Map.Entry)i.next();
    	System.out.println(ent.getKey()+":"+ent.getValue());
    }
    //integer,integer
    Map<Integer,Integer> m1=new HashMap();
    m1.put(0,122);
    m1.put(5,10);
    m1.put(7,14);
    m1.put(3,15);
    System.out.println(m1);
    
//    traversing map
    Set b=m1.entrySet(); //converting to set so that we can traverse//
    Iterator i1=b.iterator();
    while(i1.hasNext()) {
    	//converting to map entry so that we can get key and value separately//
    	
    	Map.Entry ent=(Map.Entry)i1.next();
    	System.out.println(ent.getKey()+":"+ent.getValue());
    }
	}

}
