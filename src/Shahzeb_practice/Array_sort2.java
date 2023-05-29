package Shahzeb_practice;

import java.util.Arrays;

public class Array_sort2 
{	
	public static void main(String[] args)
	{
	   String s1[]= new String[5];
	    s1[0]="Asmita";
	    s1[1]="Pramod";
	  s1[2]="Shahzeb";
	  s1[3]="Sanjay";
	  s1[4]="Amol";
	//System.out.println(s1.length);
	//System.out.println(s1[2]);
Arrays.sort(s1);
	  
	for(int i=0; i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
	System.out.println("----------------");
	
	for(int i=s1.length-1;i>=0;i--) 
    {
	    	System.out.println(s1[i]);    
    }

	}
}