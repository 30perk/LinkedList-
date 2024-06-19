
public class Node {
	Node next;
	Node prev;
	Object data;
	
	public Node(Object data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Node(Object data) {
		this.data = data;
	}
	
	public Node() {
		//empty
	}


	
}
