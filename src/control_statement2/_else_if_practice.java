package control_statement2;

public class _else_if_practice {

	public static void main(String[] args) {
	
	int mark =62;
	
	if (mark>=70) {
		System.out.println("distiction");
	}
	else if(mark>=60&mark<=70) {
		System.out.println("1st class");
	}
	else if (mark>=50 & mark<=60) {
		System.out.println("2nd class");
	}
	else if (mark>=35) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}


}
