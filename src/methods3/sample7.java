package methods3;

public class sample7 
{	
	//5: method without/zero parameter
	
	public static void main(String[] args) 
	{
		//1: static regular method call from same class  --> methodname();
		m1();
		
		//2: static regular method call from diff class --> diffclassname.methodname();
		sample8.m2();
		
		
		//3: non-static regular method call from same class   
	   sample7 s7=new sample7();                           //  step1: create an object same class
	   s7.m3();                                             //step2: method call -> objectname.methodname()
		
		 //4: non-static regular method call from diff class   
	     sample8 s8=new sample8();                          //step1: create an object of diff class
	     s8.m4();											//step2: method call -> diffClassObjectName.methodName();		
	}
	
     //method without parameter
	public static void m1()
	{
		System.out.println("running static regular method m1: from same class");		
	}
	
	 //method without parameter
	public void m3() 
	{
		System.out.println("running non-static regular method m3: from same class");
	}

}
