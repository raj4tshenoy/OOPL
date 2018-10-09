import java.util.*;
import java.util.List;

class LL<T>{
	private T data;
	private LL<T> next = null;
	
	LL(T ele, LL<T> next){
		this.data = ele;
		this.next = next;
	}

	void delete(LL<T> head){
		LL<T> node = head;
		while(node.next != null){
			node = node.next;
		}
		node = null;
	}

	void display(LL<T> head){
		System.out.println("DISPLAY LIST:");
		LL<T> node = head;
		while(node.next!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println(node.data);
	}

}

class Q3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<LL<Integer>> listi = new List<LL<Integer>>;
		List<LL<Double>> listd = new List<LL<Double>>;
		int i=0;
		listi.add(LL<Integer>(0, null));
		System.out.println("Choices: 1.Insert 2.Delete 3.Display 4.Exit");
		while(true){
			System.out.println("CHOICE: ");
			switch(in.nextInt()){
				case 1: System.out.println("Enter element: ");
						int ele = in.nextInt();
						listi.add(LL<Integer>(ele,listi[i-1]));
						break;
				//case 2: listi.delete(listi[0]);
				//		break;
				case 3: listi[0].display(listi[0]);
						break;
				default: System.exit(0);
			}
		}
	}
}