package day35_encapsulation_inheritance;

public class C01 {
	private double not=49.9;
	
	
	

	private boolean gecerMi=false;




	public void setNot(double not) {//baska claaslardan argument olarak yazýlan degerler bu methoda parametre olarak gelecek
		this.not = not;
	}




	public boolean isGecerMi() {
		
		if (not>=50) {
			gecerMi=true;
			
		}
		
		return gecerMi;
	}




	
}
