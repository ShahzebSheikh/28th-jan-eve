package Shahzeb_practice;

public class Array_dec_mul 
{
  public static void main(String[] args) 
  {
	  String s1[][]= {{"*","*","*","*"},{"*", "*","*","*"},{"*","*","*","*"},{"*", "*","*","*"}};
		
		//System.out.println(s1.length);
		//System.out.println(s1[0][1]);
		for(int i=1;i<=3;i++) 
		{
			for (int j=1;j<=3;j++) 
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
		
  }
}
