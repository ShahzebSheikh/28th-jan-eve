package control_statement;

public class _nested_if {
	public static void main(String[] args) {
		int pem=300;
		int mem=700;
		if (pem>=200) {
			System.out.println("qualify for mains");
			if (mem>=800) {
				System.out.println("got selected");
			}
			else {
				System.out.println("rejecetd from mains");
			}
		}
		else {
			System.out.println("fail");
		}
	}
	
	
}