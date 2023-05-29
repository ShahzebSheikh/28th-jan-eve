package control_statement;

public class _nested_if1 {
	public static void main(String[] args) {
		int a=300;
		int b=500;
		if(a>200) {
			System.out.println("5% discount");
		if(b>600) {
			System.out.println("10% discount");
		}
		else {
			System.out.println("only on card");
		}
		}
		else {
			System.out.println("extra chages apply");
		}
	}

}
