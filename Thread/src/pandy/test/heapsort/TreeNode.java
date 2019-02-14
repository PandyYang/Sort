package pandy.test.heapsort;

import java.util.Stack;

public class TreeNode {
	int val;
	//左子树
	TreeNode left;
	//右子树
	TreeNode right;
	//构造方法
	TreeNode(int x){
		val = x;
	}
	/*
	 * 
	 * 先序:考察一个节点后,即刻输出该节点的值,并继续遍历其左右子树
	 */
	
	//递归先序遍历
	public static void recursionPreorderTraversal(TreeNode root) {
		if(root != null) {
			System.out.println(root.val + "");
			recursionPreorderTraversal(root.left);
			recursionPreorderTraversal(root.right );
		}
	}
	
	//非递归先序遍历
	public static void preordertraversal(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node!=null||!treeNodeStack.isEmpty()) {
			while(node!=null) {
				System.out.println(node.val + " ");
				treeNodeStack.push(node);
				node = node.left;
			}
			if(!treeNodeStack.isEmpty()) {
				node = treeNodeStack.pop();
				node = node.right;
			}
		}
	}
	
	
	/*
	 * 中序
	 * 考察到一个节点后 将其暂存 遍历完整左子树后 再输出该节点的值 然后遍历右子树
	 */
	//递归
	public static void recursionMiddleorderTraversal(TreeNode root) {
		if(root!=null) {
			recursionMiddleorderTraversal(root.left);
			System.out.println(root.val+" ");
			recursionMiddleorderTraversal(root.right);
		}
	}
	
	//非递归
	public static void middleorderTraversal(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node!=null || !treeNodeStack.isEmpty()) {
			while(node!=null) {
				treeNodeStack.push(node);
				node = node.left;
			}
			if(!treeNodeStack.isEmpty()) {
				node = treeNodeStack.pop();
				System.out.println(node.val+" ");
				node=node.right;
			}
		}
	}
	/*
	 * 后序遍历
	 */
	
	//递归后序遍历
	public static void recursionPostorderTraversal(TreeNode root) {
		if(root !=null) {
			recursionPostorderTraversal(root.left);
			recursionPostorderTraversal(root.right);
			System.out.println(root.val + " ");
		}
	}
	
	//非递归后序遍历
	public static void postorderTraversal(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
		TreeNode node = root;
		TreeNode lastVisit = root;
		while(node!=null || !treeNodeStack.isEmpty()) {
			while(node!=null) {
				treeNodeStack.push(node);
				node = node.left;
			}
			node=treeNodeStack.peek();
			if(node.right==null||node.right==lastVisit) {
				System.out.println(node.val + " ");
				treeNodeStack.pop();
				lastVisit=node;
				node=null;
			}else {
				node = node.right;
			}
		}
	}
	
}
