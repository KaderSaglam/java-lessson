package day35_encapsulation_inheritance;

public class C02_Setter {

	public static void main(String[] args) {
	// ogretmenler ogrencilerin notunu girsin ama 
		//tum notlari goremesin sadece gecip gecemedigini gorsun
		
		C01 ogr1=new C01();
		
		System.out.println(ogr1.isGecerMi());///false cunku 49,9 atadik
		
		ogr1.setNot(20);
		
		System.out.println(ogr1.isGecerMi());//true

	}

}
