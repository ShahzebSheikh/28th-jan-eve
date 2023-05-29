package loops;

public class practice1 {

	public static void main(String[] args) {
		int num=3;
	switch(num)	
	{
	case(1):
	{
	System.out.println("printing table of 2");
	m1();
	break;
	}
	case(2):
	{
	System.out.println("printing even and odd no");	
	m2();
	break;
	}
	case(3):
	{
	System.out.println("printing squre no");
	m3();
	break;
	}
	default:
	{
	System.out.println("you select wrong choice");	
	}
	}
	
	}
	
	
public static void m1() {
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(i*2);
	}
}
	
	
public static void m2() {
	
	int i=1;
	
	while(i<=11)
	{
		if(i%2==0)
			
		{
			System.out.println("no is even "+i);
		}
		else	
		{
			System.out.println("no is odd"+i);
		}
		
		i++;
	}
	
}	

public static void m3()
{
	int i=1;
	
	do
	{
	System.out.println("squre of "+i+" "+(i*i));	
	
	i++;
	}
while(i<=10);	
	
}


	
}