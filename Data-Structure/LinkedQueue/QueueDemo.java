package LinkedList;

public class QueueDemo {
	public static void main(String[] args) {
		LinkQueue<String> que = new LinkQueue<String>();
		que.addQueue("a");
		que.addQueue("b");
		que.addQueue("c");
		que.displayQueue();
		que.dequeue();
		que.addQueue("d");
		
		que.displayQueue();
	}
}