package trees;

public class OrdersOfBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BST bst = new BST();
		
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		
		inorder(bst.root);
		System.out.println();
		preorder(bst.root);
		System.out.println();
		postorder(bst.root);
	}
	
	public static void inorder(TreeNode node) {

		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.value + " ");
		inorder(node.right);
	}
	
	public static void preorder(TreeNode node) {

		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public static void postorder(TreeNode node) {

		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value + " ");
	}

}
