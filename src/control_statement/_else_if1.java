package control_statement;

public class _else_if1 {
	public static void main(String[] args) {
		int a=70;
		if (a>=90) {
			System.out.println("high");
		}
		else if(a>=80& a<=90) {
			System.out.println("slightly high");
		}
		else if (a>=70&a<=80) {
			System.out.println("just high");
		}
		else if(a>30&a<=70) {
			System.out.println("low");
		}
	}
}
