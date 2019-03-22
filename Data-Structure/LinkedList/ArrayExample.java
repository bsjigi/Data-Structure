package LinkedList;

import java.util.*;
public class ArrayExample {
	public static void main(String[] args){
		
		SingleLinkedList<String> myList = new
		SingleLinkedList<String>();
		myList.addFirst("C++");
		myList.add(1,"C++");
		myList.add(1,"LISP");
		myList.add(1,"Java");
		myList.add(1,"C++");
		myList.add(1,"Python");
		myList.add(1,"C++");
		
		
		myList.traverse();
		System.out.println("++++++++++++");
		myList.remove("C++");
		myList.traverse();
		System.out.println("++++++++++++");
		
		}
	} 
