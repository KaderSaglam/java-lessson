package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		Queue <String> kuyruk =new LinkedList();
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		System.out.println(kuyruk); // eklerken sona ekler
		
		kuyruk.remove();
		System.out.println(kuyruk);//silerken bastan siler
		
		kuyruk.remove();
		System.out.println(kuyruk);// son gelen sona kadar durur
		//gelen sona gelir,silinen bastan siliir
		
		kuyruk.add("Ridvan");
		
		kuyruk.add(null);
		System.out.println(kuyruk);// hash mekanizmasi ve unique olma ozelligi yoktur
		
	}

}
