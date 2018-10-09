import java.util.*;

class Greatest3{
	public static void main(String args[])
	{
		int num1, num2, num3;
		System.out.print("Enter 3 numbers:");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		largest(num1, num2, num3);
	}
	public static void largest(int a,int b,int c)
	{
		if(a>b&&a>c)
			System.out.println(a);
		else if(b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}
}
