package control_statement;

public class _nested_if4 {
	public static void main(String[] args) {
		int bill=550;
		if (bill>=500) {
			System.out.println("no delivery charges");
		if (bill>=10000) {
			System.out.println("10% dicount");
		}
		else {
			System.out.println("no discount");
		}
		     }
		else {
			System.out.println("additional 50rs delivery charges");
		}
	}

}
