package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
	LocalDateTime tarihSaat=LocalDateTime.now();
	
	System.out.println(tarihSaat);


System.out.println(tarihSaat.toString().startsWith("2021"));
	}

}
