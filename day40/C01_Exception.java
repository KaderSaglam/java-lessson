package day40;

public class C01_Exception {

	public static void main(String[] args) {

int a=20;
int b=0;


try {
	System.out.println(a/b);//  bu islemi yapmaya calis
	
	
} catch (ArithmeticException e) {//olurda boylebir hata ile karsilasirsan  **KODUN CALÝSMASÝNÝ  DURDURMA
	
	System.out.println("bolme isleminde  payda sifir olmaz");//Bu islemi yap ve yolun devam et
	
	System.out.println(e.getMessage());/// by zero exception ýn kaynagini gosteriyor
	e.printStackTrace();
	//java.lang.ArithmeticException: / by zero
	//at day40.C01_Exception.main(C01_Exception.java:12)
}
System.out.println("gorev tamamlandi");
	}

}
