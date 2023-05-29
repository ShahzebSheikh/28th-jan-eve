package constructor;

public class shazeb 
{
int num1;
int num2;

shazeb(int a,int b)
{
 num1=a;
	num2=b;
	
}

	public void add() 
	{
		System.out.println(num1+num2);
	}
	public static void sub() 
	{
		shazeb s1=new shazeb(10,5);

		
		System.out.println(s1.num1-s1.num2);
	}
	public static void main(String[] args) {
		
		shazeb s2 =new shazeb(20,10);
		s2.add();
		sub();
	}
	
}
