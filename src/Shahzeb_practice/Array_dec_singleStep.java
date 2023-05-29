package Shahzeb_practice;

import java.util.Arrays;

public class Array_dec_singleStep 

{
  public static void main(String[] args) 
  {
	int s2[]= {50,20,40,30,10};
	
	System.out.println(s2.length); 
	System.out.println(s2[1]);
	
	System.out.println("------------");
	
	Arrays.sort(s2);
	
	for(int i=0; i<=s2.length-1;i++) 
	{
		System.out.println(s2[i]);
	}
	System.out.println("------------");
	
	for(int i=s2.length-1;i>=0;i--) 
	{
		System.out.println(s2[0]);
	}
  }
}
