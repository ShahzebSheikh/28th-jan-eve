package Shahzeb_practice;

public class multi_array 
{
	public static void main(String[] args) {
		
	
int ar[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
int br[][]= {{13,14,15,16},{17,18,19,20},{21,22,23,24}};
int cr[][] =new int[3][4];

for(int i=0;i<=2;i++) 
{
	for(int j=0;j<=3;j++) 
	{
		 cr[i][j]=ar[i][j]+ br[i][j];
		
	System.out.print(cr[i][j]+" ");
	}
	System.out.println();
}
	}
}