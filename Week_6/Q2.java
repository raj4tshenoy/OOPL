import myPackages.p1.Max;
import java.util.*;

class Q2{
	public static void main(String[] args){
		Max o = new Max();
		Scanner in = new Scanner(System.in);
		int a,b,c;
		float d,e,f;
		System.out.print("Enter 3 integers: ");
		a = in.nextInt(); b=in.nextInt(); c=in.nextInt();
		System.out.print("Enter 3 floats: ");
		d=in.nextFloat(); e=in.nextFloat(); f=in.nextFloat();
		System.out.print("Enter no of elements: ");
		int n=in.nextInt();
		System.out.print("Enter data: ");
		int g[] = new int[n];
		for(int i=0; i<n; i++){
			g[i] = in.nextInt();
		}
		System.out.print("Enter no of rows & columns: ");
		int m=in.nextInt(); int p = in.nextInt();
		int h[][] = new int[100][100];
		System.out.print("Enter data: ");
		for(int i=0; i<m; i++){
			for(int j=0; j<p; j++){
				h[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Max of 3 integers: "+o.max(a,b,c)+"\nMax of 3 floats:"+o.max(d,e,f));
		System.out.println("Max in array: "+o.max(g,n)+"\nMax in Matrix: "+o.max(h,m,p));
	}
}
