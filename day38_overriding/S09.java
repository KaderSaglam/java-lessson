package day38_overriding;

public class S09 {

	public static void main(String[] args) {
		Computer mouse = new Laptop(); //istisna
		System.out.println(mouse.getValue(100, 200));

	}
}
	class NoteBook{
		int getValue(int a,int b) {
			if(a>b)
				return a;
			else
				return b;
		}//100
	}
	
	class Computer extends NoteBook{
		int getValue(int a , int b) {
			return a*b;
		}
	}
	
	class Laptop extends Computer{
		int getValue(int a , int b) {
			return b - a;
		}
	}


