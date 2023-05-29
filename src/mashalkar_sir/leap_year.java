package mashalkar_sir;

import java.util.Scanner;

public class leap_year 
{
public static void main(String[] args) 
{
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the year");
	int num=sc.nextInt();
	
	if(num%4==0) 
	{
		System.out.println("leap year");
	}
	else 
	{
		System.out.println("not leap year");
	}
}
}
