package accessspecifier;

public class protected2 
{
	protected int i;
	protected protected2() 
	{
		i=10;
	}
	protected void cube() 
	{
		System.out.println(i*i*i);
	}
	public static void main(String[] args) {
		protected2 s1=new protected2();
		s1.cube();
		System.out.println(s1.i);
	}

}
