package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih); //2021-12-02
		
		
		
		
		System.out.println(tarih.getDayOfYear());//yilin 336. gunu
		System.out.println(tarih.getDayOfMonth());//2
		System.out.println(tarih.getDayOfWeek());//thursday
		System.out.println(tarih.getMonthValue());//12
		System.out.println(tarih.getMonth());//december
		
		
		System.out.println(tarih.plusDays(20));//20 gun sonra tarih 2021-12-22
		
		System.out.println(tarih.plusMonths(5));//5 ay sonra 2022-05-02
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));//10 yýl 10 ay 10 gun sonra 2032-10-12
		
		
		
		System.out.println(tarih.minusDays(20));// 20 gun once 2021-11-12
		
		
		System.out.println(tarih.minusYears(21).isLeapYear()); //true
LocalDate dogumTarihi1=LocalDate.of(1998, Month.JANUARY, 12);
LocalDate dogumTarihi2=LocalDate.of(2000, 01, 12);	
LocalDate dogumTarihi3=LocalDate.of(1985, 10, 10);

System.out.println(dogumTarihi1+ " , " + dogumTarihi2) ;
System.out.println(dogumTarihi1.isAfter(dogumTarihi2));//false
System.out.println(dogumTarihi2.isAfter(dogumTarihi1));



		
		
	}

}
