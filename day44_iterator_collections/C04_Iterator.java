package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	public static void main(String[] args) {
		
		//iterator kullnarak tum elementleri silin	
		
		
List<Integer> liste =new ArrayList(Arrays.asList(5,3,7,1,9,8,2));
		
		System.out.println(liste);
		
		@SuppressWarnings("rawtypes")
		Iterator ite1=liste.iterator();
		
	
		
		while (ite1.hasNext()) {
		ite1.next();
		ite1.remove();
			
		}
System.out.println(liste);
	}

}
