package test;

public class MyLinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void append (int value) {
		Node node = new Node(value);
		this.size += 1;
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.setNext(node);
			node.setPrev(this.tail);
			tail = node;
		}
	}
	
	public void removeTail () {
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size -= 1;
		}
		if (this.size >= 1) {
			Node t = tail.getPrev();
			this.tail = t;
			tail.setNext(null);
			this.size -= 1;
		}
	}
	
	public void removeElementsGreaterThan (int value) {
		int pos = 1;
		Node pointer = this.head;
		while (pos <= this.size) {
			if (pos == 1 && pointer.getData() > value) {
				head = head.getNext();
				pointer = head;
				this.size -= 1;
			} else if (pos == this.size && pointer.getData() > value) {
				tail = tail.getPrev();
				pointer = null;
				this.size -= 1;
				break;//end of list
			} else if (pointer.getData() > value) {
				Node t = pointer.getPrev();
				pointer = pointer.getNext();
				t.setNext(pointer);
				pointer.setPrev(t);
				this.size -= 1;
			} else {
				//move to next node if data is not greater than input value
				pointer = pointer.getNext();
				pos += 1; 
			}
		}
	}
	
	public void print () {
		Node t = this.head;
		for (int i=1;i<=this.getSize();i++) {
			System.out.println(t.getData());
			t = t.getNext();
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
