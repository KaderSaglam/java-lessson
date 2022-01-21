package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		//
int fiyat=100;
indirimYap(fiyat);
	}

	private static void indirimYap(int fiyat) {
		fiyat*=0.90;
		
	}

}
