package LinkedList;

public class SingleLinkedList<E> {

	private Node<E> head = null;
	private int size;
	private Node<E> tail = null;

	public SingleLinkedList() {
		head = null;
		size = 0;
		tail = null;

	}

	public void traverse() {
		Node<E> nodeRef = head;
		while (nodeRef != null) {
			if (nodeRef.next != null) {
				System.out.print(nodeRef.data);
				System.out.print(" ==> ");
			} else
				System.out.println(nodeRef.data);
			nodeRef = nodeRef.next;
		}
	}

	public void remove() {

		if (head != null) {

			head = head.next;
		}

	}

	public boolean isEmpty() {
		return head == null;
	}

	public int Size() {
		return size;
	}

	public void add(E item) {

		if (isEmpty()) {

			head = new Node<E>(item);
			tail = head;
		} else {
			Node newnode = new Node<E>(item);
			tail.next = newnode;
			tail = tail.next;

		}

	}

}
