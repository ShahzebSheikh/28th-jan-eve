package Shahzeb_practice;

public class Array_rev_order 

{
	public static void main(String[] args)
	{
	  int s2[]= new int [4];
	  s2[0]=50;
	 s2[1]=5;
	 s2[2]=30;
	 s2[3]=40;

	//System.out.println(s2.length);
	//System.out.println(s2[1]);
	
	//Arrays.sort(s2);

	for(int i=0;i<=s2.length-1;i++)
	{
	System.out.println(s2[i]);
    }
	System.out.println("------------------");

    for(int i=s2.length-1;i>=0;i--) 
    {
    	System.out.println(s2[i]);
    }


	}

}
