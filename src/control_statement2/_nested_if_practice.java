package control_statement2;

public class _nested_if_practice {
	
	public static void main(String[] args) {
		
		int shopping =550;
		
		if (shopping>=500)     //condition 1 outer if
			
		{
			System.out.println("free delivery");
			if(shopping>=5000) //condition 2 inner if/nested if
		{
			System.out.println("10% discount");	
		} 
		
		else 
		{
			System.out.println("no discount");
		}
		                  }
		else 
		{
			System.out.println("100rs delivery charges");
		}
	}
}
