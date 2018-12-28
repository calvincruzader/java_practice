class TreeNode { 
	int val;
	TreeNode left, right, next; 

	public TreeNode(int value) { 
		this.val = value;
	}
}

class TreesNextRightPointer { 

	public static void main(String[] args) { 
		TreeNode root = createTree1();


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

	public void connectNoMemory(TreeNode root) { 
		TreeNode parentLevel = new TreeNode(-1);
		TreeNode tail = parentLevel;

		while(root != null) { 
			tail.next = root.left; 
			if(tail.next != null) tail = tail.next;
			tail.next = root.right; 
			if(tail.next != null) tail = tail.next;
			root = root.next; // by the time we get here from the parent nodes, they'll already have been evaulated due to lines 17 - 20 

			if(root == null) { 
				tail = parentLevel; // this parentLevel/dummy node will currently be pointed to the first child node
				root = parentLevel.next; // assign root as parentLevel.next, which will turn the child node into the first parent node

				// we do line 24 so that when we want to go down a level, the dummy node will be pointing to that level already 
			}
		}
	}


}