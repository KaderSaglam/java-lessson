package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
			//	   Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3
		
		String input="Hellooo";
		System.out.println("yazdirma");
		System.out.println(harfSay(input));
		System.out.println("**atama**");
		Map<String, Integer>mainMap=harfSay(input);
		System.out.println(mainMap);
		//Map<String ,Integer>maplist=new HashMap<>();
	}

	private static Map<String,Integer> harfSay(String input) {
		Map<String,Integer> HarfSayilariMap=new HashMap<>();
		String inputArr[]=input.split("");
		
		 for (String each : inputArr) {
			 if (!HarfSayilariMap.containsKey(each)) {
				 HarfSayilariMap.put(each, 1);
			 }else {
				// HarfSayilariMap.get(each)+1  bu girilen harfin adedini yani valuesini bulup bir arttirir
				 HarfSayilariMap.put(each, HarfSayilariMap.get(each)+1);
				 
				
			}
			
		}
		
		return HarfSayilariMap;
		
	}

}
