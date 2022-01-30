package day35_encapsulation_inheritance;

public class Personel {
	public Personel(){
		System.out.println("Personel parametresiz consructor calisti");
	}
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	//eger variable'lara access modifier yazmazsak java access modifier olarak default
	// access modifier atar boyle olursa sadece o package altindaki child classlar
	//Personel clas'ini inherit edebilir
	//baska package'lardaki child claslarin da personeli inherit edebilmesi icin
	//variable ve methodlarin access modifier'larini protected yapariz
	//public yapsak da inherit edilebilir ama biz herkesin erismesini degil
	//sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	public static void main(String[] args) {
		

	}

}
