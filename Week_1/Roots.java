import java.util.*;

class Roots{
	public static void main(String args[])
	{
		double a, b, c, d;
		int n;		
		System.out.print("Enter coefficient of x^2: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		System.out.print("Enter coefficient of x: ");
		b = in.nextDouble();
		System.out.print("Enter value of constant: ");
		c = in.nextDouble();
		d = (b*b)-(4*a*c);
		if(d<0) //imaginary
			n=0;
		else if(d>0) //distinct
			n=1;
		else	//equal
			n=2;
		Compute(a, b, d, n);
	}
	public static void Compute(double a, double b, double d, int n){
		double x1, x2, c, r;		
		switch(n)
		{
			case 0: System.out.println("Roots are imaginary"); 
				r = (-b/(2*a));
				c = (Math.sqrt(-d)/(2*a));
				System.out.println("Roots are: " + r + "+i" + c);
				System.out.println(r + "-i" + c); break;
			case 1: System.out.println("Roots are real and distinct");
				x1 = (-b + Math.sqrt(d))/(2*a);
				x2 = (-b - Math.sqrt(d))/(2*a);
				System.out.println("Roots are: "+x1+"and"+x2); break;	
			case 2: System.out.println("Roots are real and equal");
				r=(-b+Math.sqrt(d))/(2*a);
				System.out.println("Roots are"+r+"and"+r); break;
		}
	}
}
