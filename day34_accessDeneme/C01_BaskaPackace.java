package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C01_BaskaPackace {

	public static void main(String[] args) {
		C01 obj=new C01();
	//	System.out.println(obj.sayiPrivate); //private sadece kendi classý
	//	System.out.println(obj.sayiDefault);//sadece ayni packagelar ulasýlabilir
	//	System.out.println(obj.sayiProtected);//ayni package'daki classlarv e child class'lar ulasabilir
		System.out.println(obj.sayiPublic);

	}

}
