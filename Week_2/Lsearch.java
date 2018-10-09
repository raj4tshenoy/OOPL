import java.util.*;

class Lsearch{
	public static void main(String[] args) {
		int n; //declaration
		System.out.print("Enter number of elements: ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();

		//input array
		int aray[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter element "+(i+1)+": ");
			aray[i] = in.nextInt();
		}
		Srch(aray, n); //calling search
	}
	public static void Srch(int a[], int n){
		Scanner in = new Scanner(System.in);
		int target, pos=0;
		System.out.print("Enter the element to find: "); 
		target = in.nextInt();
		for(int i=0; i<n; i++){ 
			if(target == a[i]){ //if target element exists
				pos = i+1; break; //save position to variable
			}	
		}
		if(pos==0)
			System.out.println("Value not found."); //display position
		else
			System.out.println("The value: "+target+" is found at position: " + pos);
	}
}