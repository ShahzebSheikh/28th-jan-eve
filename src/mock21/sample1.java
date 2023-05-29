package mock21;

public class sample1 
{
   // Constructor chaining
   
   sample1(int x,int y)
   {
	 System.out.println(x+y);
   }
	
   sample1(int a, int b,int c)
	{
		System.out.println(a*b*c);
	}
	
   sample1(int m, int n,int o,int p)
   {
	   System.out.println(m+n+o+p);
   }
   public static void main(String[] args) 
   {
	sample1 s1=new sample1(10,20);
	sample1 s2=new sample1(2,3,4);
	sample1 s3=new sample1(100,200,300,400);
	
	
	
	   
   }
	
	
	
}
