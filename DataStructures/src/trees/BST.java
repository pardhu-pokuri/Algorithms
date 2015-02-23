package trees;

public class BST {

	TreeNode root;
	
	public TreeNode insert0(TreeNode node, int value){
		
		if(node == null){
			node  = new TreeNode(value);
		}else{
			
			if(node.value > value){
				node.left = insert0(node.left,value);
			}else{
				node.right = insert0(node.right,value);
			}
		}
		
		return node;
		
	}
	
	public void insert(int value){
		root = insert0(root,value);
	}

}
