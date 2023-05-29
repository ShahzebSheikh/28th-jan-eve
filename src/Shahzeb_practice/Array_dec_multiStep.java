package Shahzeb_practice;

//import java.util.Arrays;

public class Array_dec_multiStep 
{
	public static void main(String[] args) {
		
	
int s3[][]= {{10,20,15,5},{10,30,50,35,},{40,30,10,60}};

System.out.println(s3.length);
System.out.println(s3[2][0]);
System.out.println("----------------");

//Arrays.sort(s3);

for(int i=0;i<=2;i++) 
{
    for(int j=0;j<=3;j++) {
    	System.out.print(s3[i][j]+" ");
}
System.out.println();

	}
	}
	
}