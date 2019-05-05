package week9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
	
		try {
			BinarySearchTree<String> BST = new BinarySearchTree<String>();

			File file = new File("C:\\Users\\com\\Downloads\\input2.txt");
			FileReader freader = new FileReader(file);
			BufferedReader breader = new BufferedReader(freader);

			String line = "";

			while ((line = breader.readLine()) != null) {
				BST.add(line);

			}
			breader.close();
			System.out.println(BST.heightOfTree(BST.root.right));
			System.out.println(BST.heightOfTree(BST.root.left));
			BST.RotationLeft();
			System.out.println(BST.heightOfTree(BST.root.right));
			System.out.println(BST.heightOfTree(BST.root.left));
			BST.RotationRight();
			System.out.println(BST.heightOfTree(BST.root.right));
			System.out.println(BST.heightOfTree(BST.root.left));

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
