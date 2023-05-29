package methods3;

public class sample5 {

	public static void main(String[] args) {
		// static regular method call from same class
		m1();                 //methodname();
		
		sample6.m2();          //diffclassname.methodname
		
		sample5 shazeb = new sample5();   //step1 create obejct of same class
		                                    
	                                                    // method call objectname.methodname
		shazeb.m3();
		
		sample6 sheikh =new sample6();
		sheikh.m4();
		
		
		
	}

	public static void m1() {
		System.out.println("hi");
	}
	
	public void m3() {
		
		
		System.out.println("how r u");
	}
	
	
	
	
	
}
