import java.util.*;

class TreeNode { 
	int val;
	TreeNode left, right, next; 

	public TreeNode(int value) { 
		this.val = value;
	}
}

class TreeNextRightPointer { 

	public static void main(String[] args) { 
		TreeNode root = createTree1();
		connectNoMemory(root);
		// traverseTreeWithNext(root);

		TreeNode root2 = createTree2();
		connectUsingMemory(root2);
		traverseTreeWithNext(root2);

	}

	public static void connectNoMemory(TreeNode root) { 
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

	public static void connectUsingMemory(TreeNode root) { 
		Deque<TreeNode> deq = new ArrayDeque<TreeNode>();
		deq.push(root);
		while(!deq.isEmpty()) { 
			int levelSize = deq.size();
			TreeNode node = null;
			while(levelSize > 0) { 
				node = deq.pollLast();
				node.next = deq.peekLast(); 

				if(node.left != null) deq.push(node.left);
				if(node.right != null) deq.push(node.right);
				levelSize--;
			}
			node.next = null;
		}
	}

	public static void traverseTreeWithNext(TreeNode root) { 
		while(root != null) { 
			TreeNode node = root;
			while(node != null) { 
				System.out.println(node.val);
				node = node.next; 
			}
			root = root.left;
		}
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

	public static TreeNode createTree2() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(30);
		return root;
	}


}