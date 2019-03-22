package arraylist;
import java.util.*;
public class ArrayExample {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Node> myList = new ArrayList<Node>();
		myList.add(new Node(1, 3.05));
		myList.add(new Node(2, 3.05));
		myList.add(new Node(3, 3.05));
		myList.add(new Node(4, 3.05));
		myList.add(new Node(5, 3.05));
		myList.add(new Node(6, 3.05));
		myList.add(new Node(7, 3.05));
		myList.add(new Node(8, 3.05));
		myList.add(new Node(9, 3.05));
		myList.add(new Node(10, 3.05));
		myList.add(new Node(11, 3.05));
		
		for(int i=0;i<myList.size();i++) {
			System.out.print(myList.get(i).ID+" ");
			System.out.println(myList.get(i).grade);
		
		}
		int n = input.nextInt();
		myList.remove(n);
		for(int i = n;i<myList.size();i++) {
			
			
			System.out.print(myList.get(i).ID+" ");
			System.out.println(myList.get(i).grade);
			
		}
		
		}
}
