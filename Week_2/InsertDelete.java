import java.util.*;

class InsertDelete{
	public static void main(String[] args) {
		int n; //declaration
		int aray[] = new int[100];
		System.out.print("Enter number of elements: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		//INPUT ARRAY
		for(int i=0; i<n; i++){
			System.out.print("Enter element "+(i+1)+": ");
			aray[i] = in.nextInt();
		}
		//CHOICE
		int k;
		System.out.print("CHOOSE: \n\n 1. INSERT ELEMENT \n 2. DELETE ELEMENT \n: ");
		k = in.nextInt();
		switch(k){
			case 1: Insert(aray, n); break;
			case 2: Delete(aray, n); break;
			default: System.out.println("Invalid Choice. The program will now terminate.");
		}

	}
	public static void Insert(int a[], int n){
		int pos, ele;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of insert element: ");
		ele = in.nextInt();
		System.out.print("Enter position of insert element: ");
		pos = in.nextInt() - 1 ;
		for(int i=n; i>=pos; i--){ //shifting right
			a[i] = a[i-1]; 
		}
		a[pos] = ele;
		Display(a, n+1);
	}
	public static void Delete(int a[], int n){
		Scanner in = new Scanner(System.in);
		int pos;
		System.out.print("Enter the position of the element to be deleted: ");
		pos = in.nextInt();
		for(int i=pos-1; i<n-1; i++){ //shifting left
			a[i] = a[i+1];
		}
		Display(a, n-1);
	}
	public static void Display(int a[], int n){
		System.out.print("\nDISPLAY ARRAY: \n\n"); //displaying array
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
	}
}