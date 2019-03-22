package LinkedList;

public class SingleLinkedList<E> {

	private Node<E> head = null;
	private int size;
	public SingleLinkedList(){
		head = null;
		size = 0;
	}
	public void addFirst(E item){

		head = new Node<E>(item,head);
		size++;
	}
	public void traverse(){
		Node<E> nodeRef = head;
		while(nodeRef!=null){
			if(nodeRef.next!=null){
				System.out.print(nodeRef.data);
				System.out.print(" ==> ");
			}else System.out.println(nodeRef.data);
			nodeRef = nodeRef.next;
		}
	}
	public E get(int index){
		Node<E> node = getNode(index);
		return node.data;
	}
	public E set(int index, E newValue){
		Node<E> node = getNode(index);
		E result = node.data;
		node.data = newValue;
		return result;
	}
	public void remove(E item){
		Node<E> curr = head;
		Node<E> prev = null;

		while(curr != null){
			//System.out.println("ss");
			if(curr.data == item) {
				if(curr == head){// 앞부분
					head = curr.next;


				}
				else {
					if (curr.next != null)// 중간부분

					prev.setNext(prev.getNext().getNext());
					else if(curr.next == null){//마지막 부분 지울때
						prev.setNext(curr.getNext());
					}
				
	

				}
			
				
				
			}

			if(curr.data!=item)
				prev=curr;

				curr = curr.next;
				;
			
			
			
		}

	


	}




	public void add(int index, E item){
		if(index == 0) addFirst(item);
		else{
			Node<E> node = getNode(index-1);
			addAfter(node,item);
		}
	}
	private Node<E> getNode(int index){
		Node<E> node = head;
		for(int i=0;i<index&&node!=null;i++) node = node.next;
		return node;
	}
	private void addAfter(Node<E> node, E item){
		node.next = new Node<E>(item, node.next);
		size++;
	} 

}
