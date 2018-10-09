import java.util.*;

class Mixer{
	int arr[] = new int[100];
	int n;
	Scanner in = new Scanner(System.in);
	void accept(Mixer ob){ 
		System.out.print("Enter number of elements in array: ");
		ob.n = in.nextInt();
		System.out.print("Enter elements of array: \n");
		for(int i=0; i<ob.n; i++){ //accepting input
			ob.arr[i]=in.nextInt();
			for(int j=0; j<i; j++){ //Checking for duplicates
				if(ob.arr[i]==ob.arr[j]){
					System.out.println("Enter a unique element: ");
					--i;
				}
			}
		}
	}
	Mixer mix(Mixer A, Mixer B){ 
		Mixer C = new Mixer();
		C.n = A.n+B.n;
		for(int i=0; i<A.n; i++){
			C.arr[i] = A.arr[i];
		}
		for(int i=A.n, j=0; i<C.n; i++, j++){
			C.arr[i] = B.arr[j];
		}
		return C;
	}
	void display(Mixer ob){
		for(int i=0; i<ob.n-1; i++){ //sort
			for(int j=0; j<ob.n-1; j++){
				if(ob.arr[j]>ob.arr[j+1]){
					int temp;
					temp = ob.arr[j];
					ob.arr[j] = ob.arr[j+1];
					ob.arr[j+1]=temp;
				}
			}
		}
		System.out.print("\n\n DISPLAY ARRAY \n\n");
		for(int i=0; i<ob.n; i++){
			System.out.print(ob.arr[i]+" ");
		}
		System.out.println(); 
	}
}

class MixerMain{
	public static void main(String[] args) {
		Mixer m1 = new Mixer();
		Mixer m2 = new Mixer();
		Mixer mixed = new Mixer();
		m1.accept(m1);
		m1.accept(m2);
		mixed = m1.mix(m1,m2);
		m1.display(mixed);
		System.out.println();
	}
}