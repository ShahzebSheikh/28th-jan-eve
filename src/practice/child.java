package practice;

 
 public class child extends parent implements interface1,interface2
 {
     public static void m2()
     {
          System.out.println("method from child class");
     }
     
     public static void main(String[] args)
     {
         child.m1();
         child.m2();
         child.m3();
         child cl =new child();
         cl.if1();
         cl.if2();
     }

	@Override
	public void if1()
	 {
		System.out.println("calling from interface 1 and implemented in child");
	 }

	@Override
	public void if2() 
	 {
		System.out.println("calling from interface 2 and implemented in child");
	 }
 }

