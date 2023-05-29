package Array;

import java.util.Arrays;

public class int_array 
{
	public static void main(String[] args) 
	{
    
		int ar[]=new int[5];
   
   ar[0]=30;
   ar[1]=20;	
   ar[2]=50;
   ar[3]=60;
   ar[4]=70;
   
   for (int i=0; i<=ar.length-1;i++) 
   {
	   System.out.println(ar[i]);
   }
   System.out.println("------------");
   
   
   Arrays.sort(ar);
  // System.out.println(ar.length);
   //System.out.println(ar[3]);
   
   for (int i=0; i<=ar.length-1;i++) 
   {
	   System.out.println(ar[i]);
   }
   System.out.println("--------------");
   
   for (int i=ar.length-1;i>=0;i--) 
   {
	   System.out.println(ar[i]);
   }
	}  
}
