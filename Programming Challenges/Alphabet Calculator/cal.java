package week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cal {
	public static void main(String[] args) throws Exception {
		Queue<Object> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);

			if ((int) a - 65 > 9) {

				if (a == 'P') {

					q.offer("+");
				} else if (a == 'S') {

					q.offer("-");
				} else if (a == 'T') {

					q.offer("*");
				} else if (a == 'V') {

					q.offer("/");
				}

			} else {

				q.offer((int) (a) - 65);

			}
			/* while(!q.isEmpty()) { System.out.print(q.poll()); } */

			sc.close();

		}
		if(q.poll(). = "+" ) {
	
	}
}
