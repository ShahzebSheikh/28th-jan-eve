package typesofvariable;

public class  typesofvar1
{
	int a=20;
	static int c=40;
     public static void main(String[] args) 
    {
	typesofvar1 m2=new typesofvar1();
			m2.m1();
			System.out.println(c);
	
	m2.m3();
   }
       public  void m1()
       {
	int b=10;
	System.out.println("printing from m1="+a+" "+b);
	   }
        public  void m3()
       {
	int b=30;
	System.out.println("printing from m3="+a+" "+b);
	   }
}
