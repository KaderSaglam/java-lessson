package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> ll =new LinkedList<>();
		System.out.println(ll); //  []
		
		
		ll.add(5);
		ll.add(7);
		ll.add(9);
		
		System.out.println(ll);  //  [5, 7]
		
		//linked List 'in iki tane interface parenti vardir.
		//birisi list, oteki de Deque ==> Queue
		
		ll.add(0, 10);// list interface 'den gelen ozellikle basa eleman ekleme
		System.out.println(ll); // [10, 5, 7]
		
		ll.addFirst(3);// quueue interfaceden gelen ozellikle basa eleman ekleme
		System.out.println(ll); // [3, 10, 5, 7]
		ll.add(0, 8);
		
		LinkedList<Integer>ll2=new LinkedList<>();
		
	ll2.addAll(ll);
	
	System.out.println(ll2);
	
	ll2.addAll(2, ll);
	
	System.out.println(ll2);
	}

}
