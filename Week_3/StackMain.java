import java.util.*;

class Stack{
	int arr[] = new int[100];
	int tos, n;
	Scanner in = new Scanner(System.in);
	void initialize(Stack ob){
		ob.tos = -1;
	}
	void push(Stack ob){
		if(ob.tos==ob.n-1){
			System.out.print("\nStack overflow.\n");
			return;
		}
		ob.arr[++ob.tos] = in.nextInt();
	}
	void pop(Stack ob){
		if(ob.tos<0){
			System.out.print("\nStack Underflow\n");
			return;
		}
		System.out.print("Element at "+(ob.tos+1)+" is: "+ob.arr[ob.tos--]);
	}
	void display(Stack ob){
		System.out.print("\n\nDisplay Stack\n\n");
		for(int i=0; i<=ob.tos; i++){
			System.out.print(ob.arr[i]+" ");
		}
		System.out.println();
	}
}

class StackMain{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack s = new Stack();
		int k;
		s.initialize(s);
		System.out.print("\nEnter stack size: ");
		s.n = in.nextInt();
		do{
			System.out.print("\n\nCHOOSE: \n1.PUSH \n2.POP \n3.display \n:");
			k = in.nextInt();
		switch(k){
			case 1: System.out.print("Enter element: "); 
					s.push(s); break;
			case 2: s.pop(s); 
					break;
			case 3: s.display(s); break;
			default: System.out.println("EXIT");
		}
	}while(k>0&&k<4);
	}
}