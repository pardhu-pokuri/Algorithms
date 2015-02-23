package trees;

public class PrintPath {

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
	
		System.out.println(printPath(bst.root, 12));
	}
	
	
	public static String printPath(TreeNode root, int value){
		
		TreeNode temp = root;
		String path = "";
		
		while(temp != null){
			
			if(temp.value == value){
				return path;
			}else if(temp.value > value){
				path = path + "1";
				temp = temp.left;
			}else{
				path = path + "0";
				temp = temp.right;
			}
		}
		
		return "";
	}

}
