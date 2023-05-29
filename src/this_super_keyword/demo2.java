package this_super_keyword;

public class demo2 extends demo1
{
     int a=15;
     
     public void m1() 
     {
    	 int a=5;
    	 System.out.println(a);
    	 System.out.println(this.a);
    	 System.out.println(super.a);
     }
     public static void main(String[] args) {
		demo2 s=new demo2();
		s.m1();
	}
}
