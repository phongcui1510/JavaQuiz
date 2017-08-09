package test;

public class Test {

	public static void main (String[] arg0) {
		MyLinkedList list = new MyLinkedList();
		list.append(1);
		list.append(4);
		list.append(6);
		list.append(1);
		list.append(2);
		list.append(10);
		list.append(11);
		list.append(5);
		list.append(15);
		list.append(20);
		list.append(100);
		list.append(101);
		list.print();
		System.out.println("-----remove tail ----------");
		list.removeTail();
		list.print();
		System.out.println("-----remove elements greater than 10----------");
		list.removeElementsGreaterThan(10);
		list.print();
	}
}
