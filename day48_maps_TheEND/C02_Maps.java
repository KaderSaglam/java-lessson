package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		
		// Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		 //map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		 //Istenen dil  java
		         //Sonuc  [Ali, Veli]
		                                    // standart Map'imizi getiriyor   
		        Map<Integer,String> soruMap=   MapOlustur.myMap();
		                                    //  class     static method
		        String istenenDil="Java";
		        
		        System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));
		        
		        
		    }
		    private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		        List<String> dilBilenListesi=new ArrayList<>();
		        soruMap.values();//bana Collection donduruyor
		        //list te collection 
		        List<String> valueList=new ArrayList<>(soruMap.values());//sadece valueleri al
		        //valueList==>eleman sayisi 3 [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#]
		        //bu uc elemani tek tek ele alip split ile bolup
		        //dil degeri verilen input'a esit olanlarin isim 
		        //degerlerini dilBilenListesi'ne ekleyecegim
		        
		        String parcaliArr[]=new String[3];
		        for (String each : valueList) {
		            parcaliArr=each.split(", ");//[Ali,Can,Java] seklinde uc elemanli bir Array getirecek
		            
		            if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
		                dilBilenListesi.add(parcaliArr[0]);
		                
		            }
		            
		            
		        }
		        
		        
		        return dilBilenListesi;
		
		

	}

}
