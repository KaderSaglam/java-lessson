package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		
		
		LocalTime saat=LocalTime.now();//22:16:49.060184100
		System.out.println(saat);
		
		int sayi=10;
		for (int i = 0; i <10000; i++) {
			sayi++;
			
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati"+ saatBitis);
		//eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak 
		//hem basinda hemde sonunda LocalTime objesi oluturmaliyiz
		
		
		
		double nano1=saat.getNano();
		double nanoBitis=saatBitis.getNano();
	System.out.println("for loop " + (nanoBitis-nano1)+ "nano saniyede tmamlandi");
	System.out.println(saat.getMinute()); //28
	System.out.println(saat.plusMinutes(10000));//22:10:41.351617200
	
	System.out.println(saat.minusHours(20));//03:32:05.451890400
	
	LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
	System.out.println(yerelSaat);
	
	
	}

}
