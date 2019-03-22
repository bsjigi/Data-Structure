package LinkedList;

public class Node<E> {
	public E data;
	public Node<E> next;
	public Node(E dataItem) {
	data = dataItem;
	next = null;
	}
	public Node(E dataItem, Node<E> nodeRef) {
	data = dataItem;
	next = nodeRef;
	}
	public Node<E> getNext()
	{
	return next;
	}
	public void setNext(Node nextNode){
	this.next = nextNode;
	}
	}