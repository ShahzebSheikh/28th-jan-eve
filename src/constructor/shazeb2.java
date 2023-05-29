package constructor;

public class shazeb2 {
	int num1;
	int num2;
	
	shazeb2(int a,int b)
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
		shazeb2 s1=new shazeb2(15,5);
		System.out.println(s1.num1-s1.num2);
		
	}
	public static void main(String[] args) 
	{
		shazeb2 s2=new shazeb2(30,15);
				s2.add();
				sub();
	}

}
