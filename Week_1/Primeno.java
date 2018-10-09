import java.util.*;

class Primeno
{
	public static void main(String args[])
	{
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		num = in.nextInt();
		for(int i=1; i<=num; i++){
			if(Prime(i)==1){
				System.out.println(i);}
		}
		
	}
	public static int Prime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				return 0;
		}	
		return 1;
	}
}
