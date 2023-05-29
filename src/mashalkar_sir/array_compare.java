package mashalkar_sir;

public class array_compare
{
	public static void main(String[] args) {
		
	
	int [] ar= {10,20,30,40,50};
	int []ar2= {20,10,30,50,60};
	
	for(int i=0;i<=4;i++) 
	{
		//for(int j=i;j<=i;j++) {
		if(ar[i]!=ar2[i]) 
		{
			System.out.println(ar[i]+" "+ar2[i]);
		}
		//}
	}
	}
}
