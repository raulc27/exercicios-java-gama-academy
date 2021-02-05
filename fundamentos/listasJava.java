package fundamentos;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listasJava {
	
	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();
		List<String> listB = new LinkedList<String>();
		List<String> listC = new Vector<String>();
		
		
		listA.add("Abacaxi");
		listA.add("Ameixa");
		listA.add("Abacaxi");

		listB.add("Banana");
		listB.add("Baiacu");
		
		listC.add("Carneiro");
		listC.add("Caqui");
		
		print(listA);
		print(listB);
		print(listC);
		
		
	}
	
	public static void print(List values) {
		Iterator<String> iterator =  values.iterator();
		
		int count = 0;
		
		System.out.println();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(++count + " - " + s + "\t" + s.hashCode());
		}
	}
}