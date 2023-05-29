package interface_implements;

public class demo1 implements sample1
{

    public void z1() 
     {
	System.out.println(a);
	System.out.println("z1 from interface");
     }
    
    public void  z2() 
     {
	System.out.println("z2 from interface");
     }
    
    public void z3() 
     {
	System.out.println("z3 from interface");
     }
    
    public void z4() 
     {
	System.out.println("z4 from interface");
     }
    
    public static void main(String[] args) 
    {
		demo1 d1=new demo1();
		d1.z1();
		d1.z2();
		d1.z3();
		d1.z4();
	}
    
}
