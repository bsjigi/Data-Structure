package arraylist;

import java.util.*;

public class ArrayList<E> {
	// Data fields
	/** The default initial capacity */
	private static final int INITIAL_CAPACITY = 5;
	/** The underlying data array */
	private E[] Node;
	/** The current size */
	private int size = 0;
	/** The current capacity */
	private int capacity = 0;
	public ArrayList(){
	capacity = INITIAL_CAPACITY;
	Node = (E[]) new Object[capacity];
	}
	public boolean add(E anEntry){
	if(size==capacity) reallocate();
	Node[size] = anEntry;
	size++;
	return true;
	}
	
	public boolean add(int index, E anEntry){
		if(index<0||index>size) throw new
		ArrayIndexOutOfBoundsException(index);
		if(size==capacity) reallocate();
		for(int i=size;i>index;i--) Node[i] = Node[i-1];
		Node[index] = anEntry;
		size++;
		return true;
		}
		public E get(int index){
		if(index<0||index>=size) throw new
		ArrayIndexOutOfBoundsException(index);
		return Node[index];
		}
		public E set(int index, E newValue){
		if(index<0||index>=size) throw new
		ArrayIndexOutOfBoundsException(index);
		E oldValue = Node[index];
		Node[index] = newValue;
		return oldValue;
		} 
		
		public E remove(int index){
			if(index<0||index>=size) throw new
			ArrayIndexOutOfBoundsException(index);
			E returnValue = Node[index];
			for(int i=index+1;i<size;i++) Node[i-1] =
			Node[i];
			size--;
			return returnValue;
			}
			public int size(){
			return size;
			}
			private void reallocate(){
			capacity = 2*capacity;
			Node = Arrays.copyOf(Node, capacity);
			}
		}
