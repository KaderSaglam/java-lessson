package day40;

public class C07_NumberFormatException {

	public static void main(String[] args) {
		String str="123a";
		//int sayi=str+4; boyle toplanmaz
		int sayi=Integer.parseInt(str)+4; // stringe integere cevirip toplariz
System.out.println(sayi);

//NumberFormatException

	}

}
