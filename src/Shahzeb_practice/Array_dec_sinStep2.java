package Shahzeb_practice;

import java.util.Arrays;

public class Array_dec_sinStep2 
{
	public static void main(String[] args)
	{
	   String s1[]= {"Asmita","Pramod","Shahzeb","Sanjay","Amol"};
	
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
