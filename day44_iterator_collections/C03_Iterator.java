package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

	public static void main(String[] args) {
		
		List<Integer> liste =new ArrayList(Arrays.asList(5,3,7,1,9,8,2));
		
		System.out.println(liste);
		
		Iterator ite1=liste.iterator();
		
		ite1.next();
		ite1.next();   //iterator ile 3 kez atlatiyor
		ite1.next();
		
		
		System.out.println(ite1.next());
		
		ite1.remove();
		
	//System.out.println(ite1.remove());
		//ite1.remove(); 1 i sildi iterater in elinde adam kalmadi o yuzden hata verir. ard arada 2 remove olmaz
		System.out.println(liste);
		//iterator butun collectionlarda kullanilir biz list i gordugumuz icin listte yapiyoruz
	}

}
