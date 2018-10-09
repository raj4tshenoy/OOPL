import java.util.*;

class Factorial{
	public static void main(String args[])
	{
		double n, r, c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of n&r: ");
		n = in.nextDouble();
		r = in.nextDouble();
		c = fact(n)/(fact(n-r)*fact(r));
		System.out.println(n+"C"+r+" = "+c);
	}
	public static double fact(double n)
	{
		double ret=1;
		for(double i=1; i<=n; i++)
			ret=ret*i;
		return ret;
	}
}
