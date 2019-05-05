package week9;

import java.util.List;
import java.util.ArrayList;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E> {
	protected boolean addReturn;
	protected E deleteReturn;

	public E find(E target) {
		return find(root, target);
	}

	private E find(BTNode<E> localRoot, E target) {
		if (localRoot == null) {
			return null;
		}
		int compResult = target.compareTo(localRoot.data);
		if (compResult == 0) {
			return localRoot.data;
		} else if (compResult < 0) {
			return find(localRoot.left, target);
		} else {
			return find(localRoot.right, target);
		}
	}

	public boolean add(E item) {
		root = add(root, item);
		return addReturn;
	}

	private BTNode<E> add(BTNode<E> localRoot, E item) {
		if (localRoot == null) {
			addReturn = true;
			return new BTNode<E>(item);
		} else if (item.compareTo(localRoot.data) == 0) {
			addReturn = false;
			return localRoot;
		} else if (item.compareTo(localRoot.data) < 0) {
			localRoot.left = add(localRoot.left, item);
			return localRoot;
		} else {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}
	}

	public E delete(E target) {
		root = delete(root, target);
		return deleteReturn;
	}

	private BTNode<E> delete(BTNode<E> localRoot, E item) {
		if (localRoot == null) {
			// item is not in the tree.
			deleteReturn = null;
			return localRoot;
		}
		int compResult = item.compareTo(localRoot.data);
		if (compResult < 0) {
			localRoot.left = delete(localRoot.left, item);
			return localRoot;
		} else if (compResult > 0) {
			localRoot.right = delete(localRoot.right, item);
			return localRoot;
		} else {
			deleteReturn = localRoot.data;
			if (localRoot.left == null) {
				return localRoot.right;
			} else if (localRoot.right == null) {
				return localRoot.left;
			} else {
				if (localRoot.left.right == null) {
					localRoot.data = localRoot.left.data;
					localRoot.left = localRoot.left.left;
					return localRoot;
				} else {
					localRoot.data = findLargestChild(localRoot.left);
					return localRoot;
				}
			}
		}
	}

	public boolean remove(E target) {
		return delete(target) != null;
	}

	public boolean contains(E target) {
		return find(target) != null;
	}

	private E findLargestChild(BTNode<E> parent) {
		if (parent.right.right == null) {
			E returnValue = parent.right.data;
			parent.right = parent.right.left;
			return returnValue;
		} else {
			return findLargestChild(parent.right);
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(BTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	public void RotationRight() {
		BTNode<E> oldRoot = root.right;
		root.right=oldRoot.left;
		oldRoot.left=root;
		root=oldRoot;
	}

	public void RotationLeft() {
		BTNode<E> oldRoot = root.left;
		root.left=oldRoot.right;
		oldRoot.right=root;
		root=oldRoot;
		
	}

	public int heightOfTree(BTNode<E> root){
		if (null == root)
			return 0;
		int hLeftSub = heightOfTree(root.left);
		int hRightSub = heightOfTree(root.right);
		return (Math.max(hLeftSub, hRightSub) + 1);
		
	}
}

