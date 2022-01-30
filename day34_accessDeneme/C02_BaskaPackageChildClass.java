package day34_accessDeneme;

import day34_accessModifier_Encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01{

	public static void main(String[] args) {
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
	//	System.out.println(obj.sayiDefault); Main methoddan ulasamamýzýn sebebi static klubu ile ilgili
		
		System.out.println(obj.sayiPublic);
		
	}
    public void staticOlmayanMethod() {
	
	C01 obj=new C01();
	
	
// 	System.out.println(obj.sayiDefault);
	
	System.out.println(sayiProtected);//bu classda sayi protected diye bir variable olmadgi halde ,
	                                   //parent class'da var oldugu icin 
	                                    //java problem yapmadi
	
	System.out.println(obj.sayiPublic);
	
}
}
