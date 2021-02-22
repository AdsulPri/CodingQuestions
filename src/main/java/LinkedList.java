import java.util.NoSuchElementException;

public class LinkedList {
	private Node first;
	private Node last;
	private int size;

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private boolean isEmpty() {
		return first == null;

	}

	public void reverse(LinkedList list) {
		// 10 -> 20 -> 30
		// currNode 30
		// 30 -> 20
		// 20 -> 10
		// 10-> null
		// 400  0    2
		// 		p   <- c   n
		if(isEmpty())
			return;
		var previous = first;
		var current = first.next;

		while (current != null) {
			var next = current.next;
			
			current.next = previous;
			previous = current;
			current = next;
		}
		last = first;
		last.next = null;
		first = previous;
	}

	private Node getPrevious(Node node) {
//important to start from first
		Node currNode = first;
		while (currNode != null) {
			if (currNode.next == node)
				return currNode;
			currNode = currNode.next;
		}
		return null;
	}

	public void print(LinkedList list) {
		var currNode = list.first;
		while (currNode != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
	}

	public void addLast(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
//important
			last.next = node;
			last = node;
		}

		size++;
	}

	public void addFirst(int item) {
		var node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
//important
			node.next = first;
			first = node;
		}
		size++;
	}

	public int indexOf(int item) {
		int index = 0;
		Node currNode = first;
		while (currNode != null) {
			if (currNode.value == item)
				return index;
			else {
				currNode = currNode.next;
				index++;
			}
		}

		return -1;
	}

	public boolean contains(int item) {
		return this.indexOf(item) != -1;
	}

	public void removeFirst() {
		var second = first.next;
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last)
			first = last = null;
		else {
			first.next = null;
			first = second;
		}
		size--;
	}

	public void removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		if (first == last)
			first = last = null;
		else {
			var previous = this.getPrevious(last);
			last = previous;
			last.next = null;
		}
		size--;
	}

	public int size() {
		return size;
	}

	public int[] toArray() {
		int[] arr = new int[size()];
		var currNode = first;
		var index = 0;
		while (currNode != null) {
			arr[index++] = currNode.value;
			currNode = currNode.next;
		}
		return arr;
	}
}
