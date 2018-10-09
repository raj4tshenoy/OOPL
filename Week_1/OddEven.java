import java.util.*;

class OddEven{
	public static void main(String args[])
	{
		int n;
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		Compute(n);
	}
	public static void Compute(int n)
	{
		if(n%2==0)
			System.out.println("Even number.");
		else
			System.out.println("Odd number.");
	}
}
