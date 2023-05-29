package mashalkar_sir;

public class Swap_number 
{
	//Swapping using without third variable
	
	public static void main(String[] args) {
		
	
 int num1=10;
 int num2=5;
 //int swap;
System.out.println("Before swapping " +num1+" and "+num2);

num1=num1+num2;       //10+5= 15
num2=num1-num2;        //15-5= 10
num1=num1-num2;        //15*-10= 5

System.out.println("After swapping " +num1+" and "+num2);
	}
}
