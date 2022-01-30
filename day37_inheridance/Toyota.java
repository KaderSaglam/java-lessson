package day37_inheridance;

public class Toyota extends Araba{

	
		protected boolean pahaliMi;
		protected String uretimYeri="Japonya";
		
		public void method1() {
			System.out.println("toyota class'indan method1 calisti");	
			}
		
		public void method2() {
			System.out.println("toyota class'indan method2 calisti");	
			
		Toyota arb4=new Toyota();
		System.out.println(arb4.tekerSayisi);
		
}
}