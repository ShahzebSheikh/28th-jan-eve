package loops;

public class forlopp15 
{
	public static void main(String[] args) 
{
	
	
	for(int i=1;i<=5;i++)      // i= 5 row   i=5>=1,4>=1,3>=1,2>=1,1>=1,0>=1
	{
	for (int j=1;j<=i;j++)    // j= 1 column   j=1<=5, 2<=5 3<=5,4<=5,5<=5,6<=5
	{
		System.out.print("*");
	}
	System.out.println();
	}

}
}