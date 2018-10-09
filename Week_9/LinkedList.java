public class LinkedList<T> {

	private LinkedListNode<T> first = null;
	
	/**
	 * Insert at the front of the list
	 * @param node
	 */
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	/**
	 * Remove from the front of the list
	 * @param node
	 */
	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}
	
	/**
	 * Recursively traverse this list and print the node value
	 * @param node
	 */
	private void printList(LinkedListNode<T> node) {
		System.out.println("Node is " + node.getValue());
		if(node.getNext()!=null) printList(node.getNext());
	}

	public void print(){
		printList(first);
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(new LinkedListNode<Integer>(5));
		list.insert(new LinkedListNode<Integer>(10));
		list.insert(new LinkedListNode<Integer>(15));
		list.insert(new LinkedListNode<Integer>(20));
		list.print();
		list.remove();
		System.out.println("After removing front");
		list.print();
	}

}

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