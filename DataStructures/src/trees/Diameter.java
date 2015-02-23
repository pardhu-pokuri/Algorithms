package trees;

public class Diameter {

	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		
		System.out.println(findDiameter(bst.root));
	}
	
	
	public static int findDiameter(TreeNode node){
		
		if(node == null){
			return 0;
		}
		
		int left_height = height(node.left);
		int right_height = height(node.right);
		
		
		int left_diameter = findDiameter(node.left);
		int right_diameter = findDiameter(node.right);
		
		
		
		return Math.max(1+left_height + right_height, Math.max(right_diameter , left_diameter));
	}
	
	public static int height(TreeNode node){
		
		if(node == null){
			return 0;
		}
		
		int left_height = height(node.left);
		int right_height = height(node.right);
		
		return 1+ Math.max(left_height, right_height);
	}
	
	public static int optimizedDiameter(TreeNode node, HeightWrapper height){
		
		if(node == null){
			return 0;
		}
		
		HeightWrapper lh = new HeightWrapper();
		HeightWrapper rh = new HeightWrapper();
		
		int ld = optimizedDiameter(node.left,lh);
		int rd = optimizedDiameter(node.right,rh);
		
		height.height = Math.max(lh.height, rh.height) + 1;
		
		return Math.max(lh.height+rh.height + 1, Math.max(ld,rd));
	}
	
	

}

class HeightWrapper{
	int height = 1;
}
