package trees;

public class LeftLeavesSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(20);
		bst.insert(9);
		bst.insert(49);
		bst.insert(5);
		bst.insert(12);
		bst.insert(15);
		bst.insert(23);
		bst.insert(52);
		bst.insert(50);
		
		System.out.println(getLeftLeavesSum(bst.root));
	}

	/*
	 *  
	 * 
	 * 
	 * 
	 */
	
	private static int getLeftLeavesSum(TreeNode root) {

		int sum = 0;
		
		if(root == null){
			return 0;
		}else{
			
			if(isLeaf(root.left)){
				sum += root.left.value;
			}else{
				sum += getLeftLeavesSum(root.left);
			}
			
			sum += getLeftLeavesSum(root.right);
		}
		
		return sum;
		
		
	}
	
	private static boolean isLeaf(TreeNode node){
		
		if(node != null && node.left == null && node.right == null){
			return true;
		}
		
		return false;
	} 

}
