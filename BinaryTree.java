import java.util.*;

class BinaryTree { 

	public static void main(String[] args) { 
		TreeNode root = createTree1();
		List<TreeNode> postOrderTraversal = postOrderTraversalIterative(root);

		for(TreeNode node : postOrderTraversal) System.out.println(node.val);
	}

	public static TreeNode createTree1() {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(3);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(20);
		return root;
	}

	public static List<TreeNode> postOrderTraversalIterative(TreeNode root) { 
		Stack<TreeNode> callStack = new Stack<TreeNode>();
		Stack<TreeNode> outputStack = new Stack<TreeNode>();
		List<TreeNode> outputList = new ArrayList<TreeNode>();

		callStack.push(root);

		while(!callStack.isEmpty()) {
			TreeNode node = callStack.pop();
			outputStack.push(node);
			if(node.right != null) callStack.push(node.right);
			if(node.left != null) callStack.push(node.left);
		}
		while(!outputStack.isEmpty()) { 
			outputList.add(outputStack.pop());
		}

		return outputList;
	}
}


	class TreeNode { 
		int val; 
		TreeNode left, right; 

		public TreeNode(int value) { 
			this.val = value;
		}
	}