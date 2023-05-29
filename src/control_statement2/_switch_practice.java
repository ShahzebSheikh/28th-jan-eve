package control_statement2;

public class _switch_practice {
	public static void main(String[] args) {
		char symbol='*';
		
		switch(symbol) {
		case '+':
		{
			System.out.println("addition");
		    break;	
		}
		case '-':
		{
			 System.out.println("sub");
			 break;
		}
		case '*':
		{
			 System.out.println("mul");
			 break;
		}
		default: System.out.println("you enter wrong symbol");
		}
	}

}
