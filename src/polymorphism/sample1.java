package polymorphism;

public class sample1 
{
    public void add(int num1,int num2) 
    {
		System.out.println(num1+num2);
	}
    
    public void add(int num1,int num2,int num3) 
    {
		System.out.println(num1+num2+num3);
	}
    
    public void add(int num1,int num2,int num3,int num4) 
    {
		System.out.println(num1+num2+num3+num4);
	}
    
    public static void main(String[] args) 
    {
		
    	sample1 s1= new sample1();
    	s1.add(5,3);
    	s1.add(10,15,20);
    	s1.add(1,2,3,4);
	}
}
