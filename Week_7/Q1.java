import java.util.*;

interface Stack{
	void push(int ele);
	int pop();
	void display();
}

class FixedStack implements Stack{
	int list[];
	int top;
	FixedStack(){
		list = new int[5];
		top = -1;
	}
	public void push(int ele){
		System.out.println(top);
		if(top>=4){
			System.out.println("Stack Full");
			return;
		}
		else{
			list[++top] = ele;
			System.out.println(top);
		}
		System.out.println("Element Pushed");
	}
	public int pop(){
		if(top<0){
			System.out.println("Stack Empty");
			return 0;
		}
		else{
			return list[top--];
		}
	}
	public void display(){
		System.out.print("Display FixedStack: \n");
		if(top<0){
			System.out.println("Stack Empty");
			return;
		}
		for(int i=0; i<top; i++){
			System.out.print(list[i]+" ");
		}
	}
}

class DynamicStack implements Stack{
	int list[];
	int top, max;
	DynamicStack(int max){
		list = new int[max];
		top = -1;
		this.max = max;
	}
	public void push(int ele){
		if(top>=max-1){
			System.out.println("Stack Full");
			return;
		}
		else{
			list[++top] = ele;
		}
		System.out.println("Element Pushed");
	}
	public int pop(){
		if(top<0){
			System.out.println("Stack Empty");
			return 0;
		}
		else{
			return list[top--];
		}
	}
	public void display(){
		System.out.print("Display DynamicStack: \n");
		for(int i=0; i<top; i++){
			System.out.print(list[i]+" ");
		}
	}
}

class Q1{
	static Scanner in = new Scanner(System.in);
	static void stackfn(Stack s){
		int k;
		do{k=1;
			System.out.print("CHOOSE 1.Push 2.Pop 3.Display: ");
			int ch = in.nextInt();
			switch(ch){
				case 1: System.out.print("Enter ele: "); 
						int ele = in.nextInt();
						s.push(ele); break;
				case 2: System.out.println("Element popped: "+s.pop());
						break;
				case 3: s.display();
			}
			System.out.println("Enter 0 to exit: ");
			k=in.nextInt();
		}while(k!=0);
	}

	public static void main(String[] args) {
		Stack fs = new FixedStack();
		System.out.println("FixedStack: ");
		stackfn(fs);		
		System.out.println("DynamicStack: ");
		System.out.print("Enter max: ");
		int max = in.nextInt();
		Stack ds = new DynamicStack(max);
		stackfn(ds);
	}
}