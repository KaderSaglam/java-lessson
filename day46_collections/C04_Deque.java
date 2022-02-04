package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		Deque<String>ciftBasli=new LinkedList<>();
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli);//[Yildiz, Ali] Queu den geldiginden sona ekler
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli);//[Yildiz, Ali, Emine]   Dequeden gelen ozellik
		
		
		System.out.println(ciftBasli.pop());// yildiz
		System.out.println(ciftBasli);
		
		ciftBasli.push("Kader"); // basa ekler push
		//add firsten farki ne exepcitionla ilgili farklar olabilir
		System.out.println(ciftBasli);
		
		
		// deque null u kabul etmez
		
		ciftBasli.add(null);
		System.out.println(ciftBasli);
		
		

	}

}
