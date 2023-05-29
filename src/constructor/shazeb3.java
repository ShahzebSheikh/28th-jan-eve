package constructor;

public class shazeb3
{
	int num1;
	int num2;
	String name;
	
	shazeb3()
	{
		num1=10;
		num2=20;
	}
	shazeb3(int a,int b)
	{
		num1=a;
		num2=b;
	}
	shazeb3(String s1)
	{
		name=s1;
	}
	public static void main(String[] args) {
		shazeb3 s1=new shazeb3();
		s1.add();
		shazeb3 s2=new shazeb3(5,3);
		s2.mul();
		shazeb3 s3=new shazeb3("smita");
		s3.sinfo();
	}
	public void add() 
	{
		System.out.println(num1+num2);
	}
	public void mul() 
	{
		System.out.println(num1*num2);
	}
	public void sinfo() 
	{
		System.out.println(name);
	}

}
