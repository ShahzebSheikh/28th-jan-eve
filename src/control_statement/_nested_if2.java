package control_statement;

public class _nested_if2 {
	public static void main(String[] args) {
		int a=2000;
		int b=5000;
		
		if (a>=1000) {
			System.out.println("5% discount");
		if (a>=2000) {
			System.out.println("10% discount");
		if (b>=3000&b<=4000) {
			System.out.println("15% discount");}
		else {
			System.out.println("30% discount");
		}
		}
		}	
		
		else {
			System.out.println("not applicable");
			
		}
		
	}

}
