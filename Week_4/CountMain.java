import java.util.*;

class Counter{
	static int count = 0;
	static void showCount(){
		System.out.println("Number of objects created: "+count);
	}
	Counter(){
		count++;
	}
}
class CountMain{
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of objects to create: ");
		n = in.nextInt();
		Counter c[] = new Counter[n];
		for(int i=0; i<n; i++){
			c[i] = new Counter();
		}
		c[n-1].showCount();
	}
}