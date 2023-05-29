package control_statement;

public class _nested_if6 {
	public static void main(String[] args) {
		int c = 100;
		if (c>=5000) {
			System.out.println("free delivery");
		if (c>=10000) {
			System.out.println("10% discount");
		}	
		else {
			System.out.println("no discount");
		}
		}
		else {
			System.out.println("50 rs delivery charges");
		}
	}

}
