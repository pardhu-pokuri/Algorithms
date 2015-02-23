package trees;

public class PrintLeaves {

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
		bst.insert(0);
		
		printLeaves(bst.root);
		
	}
	
	public static void printLeaves(TreeNode node){
		
		if(node == null){
			return;
		}
		
		if(node.left == null && node.right == null){
			System.out.print(node.value +  " ");
		}else{
			printLeaves(node.left);
			printLeaves(node.right);
		}
	}
	
	

}
