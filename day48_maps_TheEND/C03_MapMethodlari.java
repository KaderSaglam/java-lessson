package day48_maps_TheEND;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		Map<Integer, String> ornek=MapOlustur.myMap();
		System.out.println(ornek);
		
System.out.println(ornek.containsKey(110));//false

System.out.println(ornek.containsValue("java"));// bizim tek basina java diye eleman yok //false 
System.out.println(ornek.containsValue("Veli, Yan, java"));//true

System.out.println(ornek.containsValue("Ali, Can, java"));
	
	
	
Set<Entry<Integer, String>> entrySet = ornek.entrySet(); // herbir eleman entry 101=Ali, Can, java  gibi..
	//entry--> Map teki key valuenin þu(101=Ali, Can, java)haline entry deniyor
int sayac=1;
	for (Entry<Integer, String> each : entrySet) {
		System.out.println(sayac+ ". entry : "+ each);
		sayac++;
	//alt alta yazdirmak istersek kullanabiliriz	
	}
	System.out.println(ornek.getOrDefault(110, "girilen key mapta ypk"));
	System.out.println(ornek.getOrDefault(105, "girilen key mapta ypk"));
	//110 varsa onu getirecek yoksa  bizim yazdðimiz stringi getircek
	//105 varsa onu getirecek yoksa  bizim yazdðimiz stringi getircek
	
	
	ornek.putIfAbsent(103, "can, Yan, C#");//eklemeyecek bu var yoksa ekleyecek
	//keye bakiyor key varsa eklemiyor
	//value nin icine bakmiyor
	System.out.println(ornek);
	ornek.putIfAbsent(110, "Fikri, Yan, QA");// BU EKLER. bundan sonra listeyi calistrirsaniz 110 da cikar
	sayac=1;
	for (Entry<Integer, String> each : entrySet) {
		System.out.println(sayac+ ". entry : "+ each);
		sayac++;
	}
	String maptenString=ornek.toString();
	System.out.println(maptenString);
}
	
	}


