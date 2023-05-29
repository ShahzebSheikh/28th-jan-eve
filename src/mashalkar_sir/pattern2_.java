package mashalkar_sir;

import java.util.Scanner;

public class pattern2_
{
	  public static void main(String[] args) 
	    {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of row");
		r=sc.nextInt();
		for(int i=1;i<=r;i++) 
		{
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			 
			
			for(int k=r;k>=i;k--) 
			{
				System.out.print("+ ");
				
			}
			System.out.println();
		} 
		for(int i=1;i<=r;i++) 
		{
			
			for(int j=1;j<=r-i;j++) 
			{
				System.out.print(" ");
			}
			
			
			for(int k=1;k<=i;k++) 
			{
				System.out.print(" +");
				
			}
			System.out.println();
		} 
	  }
}
