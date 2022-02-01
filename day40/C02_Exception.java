package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// kullanicidan istedigi kadar sayi alip
		//bu sayilari toplayan bir program yapiniz
		//sayi girisini bitirmek icin q ya basiniz
		
		
		int sayi=0;
		int toplam=0;
		int count=0;
		
		
		Scanner scan=new Scanner(System.in);
		//InputMismatchException
		
		try {
			while (count<10000) {
				
				System.out.println("lutfen toplamak icin bir sayi yaziniz \n bitirmek icin q ya basiniz");
					sayi=scan.nextInt()	;	
							toplam+=sayi;
							count++;
			}	
		} catch(InputMismatchException e) {
			System.out.println("sayilarin toplami : "+ toplam);
		}
		
		
		
		
		
		
		

	}

}
