package day40;

import java.util.Scanner;

public class C08_IllegalargumentException {

	public static void main(String[] args) {
		//soru kullanicidan yasini girmesini isteyiniz
		//kodunuzu kullanici 
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
int yas=scan.nextInt();

try {
	if (yas<0) {
		throw new IllegalArgumentException();
		
	} else {
System.out.println(yas);
	}
	
}catch( IllegalArgumentException e) {
	System.out.println(e);
	System.out.println("yas sifirdan kucuk olamaz");

	}

	}

}
