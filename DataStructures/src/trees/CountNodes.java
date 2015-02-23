package trees;

public class CountNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		BST bst = new BST();
		
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(9);
		bst.insert(12);
		bst.insert(3);
		bst.insert(1);

		
		System.out.println(countNodes(bst.root));
	}
	
	public static int countNodes(TreeNode node) {

		if(node == null){
			return 0;
		}
		
		int left_count = countNodes(node.left); 
		int right_count = countNodes(node.right);
		
		return left_count + right_count + 1;
		
	}

}
