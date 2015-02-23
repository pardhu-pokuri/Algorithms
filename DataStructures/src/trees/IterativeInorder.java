package trees;

import java.util.Stack;

public class IterativeInorder {

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
		
		iterativeInorder(bst.root);
	}
	
	
	public static void iterativeInorder(TreeNode node){
		
		TreeNode current = node;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while (true) {

			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {

				if (!stack.isEmpty()) {

					TreeNode item = stack.pop();
					System.out.print(item.value+ " ");
					current = item.right;

				} else {
					return;
				}

			}
		}
		
		
	}

}
