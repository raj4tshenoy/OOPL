import java.util.*;

class MatrixAdd{
	public static void main(String[] args) {
		int r1, r2, c1, c2; //declaration
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows and columns of Matrix A: ");
		r1 = in.nextInt();
		c1 = in.nextInt();
		System.out.print("Enter number of rows and columns of Matrix B: ");
		r2 = in.nextInt();
		c2 = in.nextInt();
		if((r1!=r2)||(c1!=c2)){ 
			System.out.println("The two matrices cannot be added. The program will now terminate.");
			return;
		} 
		int A[][] = new int[100][c1];
		int B[][] = new int[100][c2];
		for(int i=0; i<r1; i++){ //input array matrix a
			for(int j=0; j<c1; j++){
				System.out.print("Enter value of A["+(i+1)+"]["+(j+1)+"]: ");
				A[i][j] = in.nextInt();
			}
		}
			for(int i=0; i<r2; i++){
			for(int j=0; j<c2; j++){ //input array matrix b
				System.out.print("Enter value of B["+(i+1)+"]["+(j+1)+"]: ");
				B[i][j] = in.nextInt();
			}
		}

		Addm(A, B, r1, c1); //calling addition function
	}
	public static void Addm(int a[][], int b[][], int m, int n){ 
		int C[][] = new int[100][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				C[i][j] = a[i][j] + b[i][j]; //adding corresponing elements
			}
		}
		Display(C, m, n); //calling display function
	}
	public static void Display(int c[][], int m, int n){
		System.out.print("\n\nDISPLAY SUM OF MATRICES: \n\n\n"); //displaying final array matrix
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}