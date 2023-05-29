package control_statement;

public class _else_if {
public static void main(String[] args) {
	int mark=30;
	if (mark>=70) {
		System.out.println("Distinction");
	}
	else if(mark>=60&mark<=70) {
		System.out.println("first class");
	}
	else if (mark>=50&mark<=60)
	{	System.out.println("2nd class");
	}
	else if(mark>=40&mark<=50) {
		System.out.println("pass");
	}
	else if(mark<35) {
		System.out.println("fail");
	}
}
}
