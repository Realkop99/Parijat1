package first;

public class Calculator
{
	public static final double PI=3.14;
	public static int square(int x)
	{ return x*x; }
	
	public static int sum (int x,int y)
	{ return x+y; }
	
	public int power(int x, int n)
	{
		int res=1;
		for(;n>0;n--)
			res=res*x;
		return res;
	}
}