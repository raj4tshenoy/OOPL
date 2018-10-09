import java.util.*;


class Matrix extends Thread{
	static int c = 1;
	int a[];
	int r[];
	Matrix(int a[], int r[]){
		this.a = a;
		this.r = r;
	}
	public void run(){
		for(int i=0; i<a.length; i++){
			r[0]+=a[i];
		}
		System.out.println("Thread "+c+" complete.");
		c++;
	}
}

class Q2{
	public static void main(String[] args) {
		int rs[] = new int[1]; //simulation of pointer
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of rows & cols: ");
		int A[][] = new int[in.nextInt()][in.nextInt()];
		System.out.println("Enter DATA: ");
		for(int i=0; i<A.length; i++){ //input
			for(int j=0; j<A[i].length; j++){
				A[i][j] = in.nextInt();
			}
		}
		Matrix t[] = new Matrix[A.length];
		for(int i=0; i<A.length; i++){
			t[i] = new Matrix(A[i],rs);
			t[i].start();
		}
		for(int i=0; i<A.length; i++){
			try{
				t[i].join();
			}
			catch(InterruptedException e){}
		}
		System.out.println("Sum of Row Sums is: "+rs[0]);
	}
}