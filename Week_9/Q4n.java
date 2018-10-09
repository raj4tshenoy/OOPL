

class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;

	public LinkedListNode(T value) {
		this.value = value;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}
}

class LinkedList<T> {

	private LinkedListNode<T> first = null;

	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}
	
	private void printList(LinkedListNode<T> node) {
		System.out.println("Node is " + node.getValue());
		if(node.getNext()!=null) printList(node.getNext());
	}

	public void print(){
		printList(first);
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.print("Choices: 1.Insert 2.Delete 3.Display 4.Exit");
		while(true){
			System.out.print("Enter choice: ");
			switch(in.nextInt()){
				case 1: System.out.print("Enter int: ");
						list.insert(new LinkedListNode(in.nextInt()));
				case 2: list.remove();
				case 3: list.print();
				default: break;
			}
		}
		LinkedList<Double> list = new LinkedList<Double>();
		while(true){
			System.out.print("Enter choice: ");
			switch(in.nextInt()){
				case 1: System.out.print("Enter int: ");
						list.insert(new LinkedListNode(in.nextDouble()));
				case 2: list.remove();
				case 3: list.print();
				default: break;
			}
		}
	}

}