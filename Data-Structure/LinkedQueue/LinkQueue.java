package LinkedList;

public class LinkQueue<E> {

	SingleLinkedList<E> newLinkList = new SingleLinkedList<E>();

	public void dequeue() {
		if (!newLinkList.isEmpty())
			newLinkList.remove();
	}

	public void displayQueue() {
		newLinkList.traverse();
	}

	public boolean isEmpty() {
		return newLinkList.isEmpty();
	}

	public int Size() {
		return newLinkList.Size();
	}

	public void addQueue(E data) {
		newLinkList.add(data);

	}

}