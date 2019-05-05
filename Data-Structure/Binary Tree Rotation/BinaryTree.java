package week9;

public class BinaryTree<E> {
	public class BTNode<E> {
		protected BTNode<E> left, right, oldRoot;
		protected E data;
		

		public BTNode() {
			left = null;
			right = null;
			oldRoot=null;
			data = null;
			
		}

		public BTNode(E n) {
			left = null;
			right = null;
			this.data = n;
			
		}

		public E getData() {
			return data;
		}

		public BTNode<E> getRight() {
			return right;
		}

		public BTNode<E> getLeft() {
			return left;
		}
		
	}

	protected BTNode<E> root;

	public BinaryTree() {
		root = null;
	}

	protected BinaryTree(BTNode<E> root) {
		this.root = root;
	}

	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		root = new BTNode<E>(data);
		if (leftTree != null) {
			root.left = leftTree.root;
		} else {
			root.left = null;
		}
		if (rightTree != null) {
			root.right = rightTree.root;
		} else {
			root.right = null;
		}
	}

	public void insert(E data) {
		root = insert(root, data);
	}

	private BTNode<E> insert(BTNode<E> node, E data) {
		if (node == null)
			node = new BTNode<E>(data);
		else {
			if (node.getRight() == null)
				node.right = insert(node.right, data);
			else
				node.left = insert(node.left, data);
		}
		return node;
	}

	public E getData() {
		return root.getData();
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(BTNode<E> r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(BTNode<E> r) {

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(BTNode<E> r) {

	}
}
