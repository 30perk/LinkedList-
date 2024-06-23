import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Linky {

	Node head;
	Node tail;
	int size = 0;

	// size
	public int size() {
		return size;
	}

	// add first -good
	public void addFirst(Object data) {

		Node addNode = new Node(data);

		if (head == null) {
			head = addNode;
			tail = addNode;

		} else {
			addNode.next = head;
			head.prev = addNode;
			head = addNode;
		}
		size++;

	}

	// add to end create tail node -good
	public void addLast(Object data) {

		// new node
		Node addNode = new Node(data);
		// empty list
		if (head == null) {
			head = addNode;
			tail = addNode;

		} else {
			// not empty
			addNode.prev = tail;
			tail.next = addNode;
			// update tail
			tail = addNode;

		}
		size++;

	}

	// remove First -good
	public void removeFirst() {

		try {

			if (head == null) {
				throw new NoSuchElementException("No element to remove");
			}

			if (head.next == null) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}

		} finally {
			if (size > 0) {

				size--;
			}
		}

	}

	// removeLast -good
	public void removeLast() {
		// empty list
		try {

			if (head == null) {

				throw new NoSuchElementException("No element to remove");
			}

			// only one Node
			if (head.next == null) {
				head = null;
				tail = null;
				return;
			}

			else {

				// more than one
				tail = tail.prev;
				tail.next = null;

			}

		} finally {
			if (size > 0) {

				size--;
			}
		}

	}

	// get -good
	public Object get(int index) {
		// out of bounds
		if ((index >= size) || (index < 0)) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		Node curr = head;
		int count = 0;
		while (count < index) { // idx 4,
			curr = curr.next;
			count++;
		}
		return curr.data;

	}

//  good
	public boolean contains(Object obj) {
		if (size == 0) {
			return false;

		} else {

			Node rp = tail;
			Node lp = head;

			while (lp != null && rp != null && lp != rp && lp.next != rp) {
				if ((lp.data.equals(obj)) || (rp.data.equals(obj))) {
					return true;
				}
				lp = lp.next;
				rp = rp.prev;

			}

			// in case size is odd
			if (lp != null & lp.data.equals(obj)) {
				return true;
			}

		}
		return false;

	}

	// extra practice
	public Object binaryGet(int index) {
		// out of bounds
		if ((index >= size) || (index < 0)) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		// use head
		if (index < (size / 2)) {
			Node curr = head;
			int count = 0;
			while (count < index) {
				curr = curr.next;
				count++;
			}
			return curr.data;

			// use tail
		} else {

			Node curr = tail;
			int count = size - 1;
			while (count > index) {
				curr = curr.prev;
				count--;
			}
			return curr.data;
		}

	}

	public static void main(String[] args) {
		Linky link = new Linky();

		LinkedList<Integer> nah = new LinkedList<>();

		nah.add(1);
		nah.add(2);
		nah.add(3);
		nah.add(4);
		System.out.println(nah.getFirst()); // 1
		nah.addFirst(9);
		System.out.println(nah.getFirst()); // 9
		nah.removeFirst();
		System.out.println(nah.get(0)); // 1
		System.out.println(nah.contains(1));

		link.addLast(1);
		link.addLast(2);
		link.addLast(3);
		link.addLast(4);
		System.out.println(link.get(0)); // 1
		link.addFirst(9);
		System.out.println(link.get(0)); // 9
		link.removeFirst();
		System.out.println(link.get(0)); // 1
		System.out.println(link.contains(1));
		System.out.println(link.get(-1));

	}

}
