import java.util.*;

class BubbleSort{
	public static void main(String args[]){
		int n; 
		System.out.print("Enter number of elements: ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int aray[] = new int[n];
		
		//Input array
		for(int i=0; i<n; i++){
			System.out.print("Enter element "+(i+1)+": ");
			aray[i] = in.nextInt();		
		}
		
		//Choice
		int k;
		System.out.print("CHOOSE: \n 1. SORT ASCENDING \n 2. SORT DESCENDING \n\n:");
		k = in.nextInt();
		switch(k){
			case 1: Sorta(aray, n); break;
			case 2: Sortd(aray, n); break;
			default: System.out.println("Invalid choice. The program will now terminate."); return;
		}	
	}
	public static void Sorta(int a[], int n){ //SORT ASCENDING
		int temp;
		for(int i=0; i<n-1; i++){  //for each element of the array
			for(int j=0; j<n-1; j++){ //compare to every element and if greater, swap.
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;				
				}		
			}		
		}
	Display(a, n); //Calling display
	}
	public static void Sortd(int a[], int n){ //Sort Descending
	int temp; 
		for(int i=0; i<n-1; i++){ //for each element of the array
			for(int j=0; j<n-1; j++){ //compare to every element and if less, swap.
				if(a[j]<a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;				
				}		
			}		
		}
	Display(a, n); //Calling Display
	}
	public static void Display(int a[], int n){
		System.out.println("\n\nDISPLAY ARRAY: \n"); //Displaying Array
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");		
		}
		System.out.println("");	
	}
}
