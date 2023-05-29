package Array;

import java.util.Arrays;

public class string_array 
 {
	public static void main(String[] args) 
	{
    
		String ar[]=new String[5];
   
   ar[0]="rakesh";
   ar[1]="mahesh";	
   ar[2]="dinesh";
   ar[3]="pritesh";
   ar[4]="shailesh";
   
  //System.out.println(ar.length);
  // System.out.println(ar[3]);
   Arrays.sort(ar);
   
   for (int i=0; i<=ar.length-1;i++) 
   {
	   System.out.println(ar[i]);
   }
	}  
 }
