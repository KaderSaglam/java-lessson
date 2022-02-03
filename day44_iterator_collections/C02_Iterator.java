package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C02_Iterator {

	public static void main(String[] args) {
		
List <Integer> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste); // [5,    3,    7,    1,    9,    8,   2]
		
		Iterator ite1=liste.iterator();
		
		
		for (int i = 0; i < liste.size(); i++) {
			
			
			System.out.println(ite1.hasNext() + " ==== " + ite1.next());
		}
		
		//HAS sahipmolmak demek next te yanı basında demek =senden sonra eleman var mi
		
		//  next methodu ise imleci bir ileriki sıraya tasır delil olarak da uzerinden atladigii elemeni getirir
		//hasnex true yada false dondurur
		System.out.println(ite1.hasNext()); // false  yanında eleman var mi
		//System.out.println(ite1.next()); // java.util.NoSuchElementException 2. defa sordugumuz icin exception verdi
		
		
		//iterator index e bagi olmaksizin elementleri bir yandakine tasir. for  ea mantigi gibi ama bu siralidir
		
		
		
		
		
		

	}

}
