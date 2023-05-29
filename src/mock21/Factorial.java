package mock21;

public class Factorial 
{
public static void main(String[] args) 
{
	int num=5;
	int fact=1;
	
	for(int i=num;i>=2;i--) 
	{
		fact=fact*i;
		
	}
	System.out.println(fact);
	
}
}
