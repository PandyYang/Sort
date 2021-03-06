package pandy.test.tree;
/*
 * 二叉树类
 */
public class Tree {
	//根节点
	public Node root;
	
	/*
	 * 插入一个节点
	 * 根据二叉树的性质 比较新插入节点域当前节点的大小
	 * 用来判断插入的是右子节点还是左子节点
	 */
	public void insert(long value,String sData) {
		//节点包含数据 左右子节点 封装节点
		Node newNode = new Node(value,sData);
		//引用当前节点
		Node current = root;
		//引用父节点
		Node parent;
		//如果root为null 也就是第一次插入的时候
		if(root==null) {
			root = newNode;
			return;
		}else {
			while(true) {//死循环 遍历整个树的趋向 以找到合适的节点
				//父节点指向当前节点
				parent = current;
				//如果当前指向的节点数据比插入的要大 左走
				if(current.data>value) {
					current = current.leftChild;
					//遍历至当前节点的左节点为null 构建新的节点
					if(current==null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					current = current.rightChild;
					//遍历至当前节点的右节点为null 构建新的节点
					if(current==null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	/*
	 * 查找节点
	 * 从根节点查找 查找的节点比当前节点小 就查找左树
	 * 否则就查找右树
	 */
	public Node find(long value) {
		//引用当前节点 从根节点开始
		Node current = root;
		//循环只要查找值不等于当前节点的数据项(父节点)
		while(current.data !=value) {
			//比较查找值与当前节点之间的大小关系
			if(current.data>value) {
				current = current.leftChild;
			}else {
				current= current.rightChild;
			}
			//当前树中没有要查找的值
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	/*
	 * 删除节点
	 * 该节点是叶子节点 没有子节点
	 * 该节点有一个子节点
	 * 该节点有两个子节点
	 */
	public boolean delete(long value) {
		//引用当前节点 从根节点开始
		Node current = root;
		//应用当前节点的父节点
		Node parent = root;
		//判断是否为左节点
		boolean isLeftChild = true;
		
		while(current.data!=value) {
			parent = current;//父节点
			//进行比较 比较查找值和当前节点的大小
			if(current.data>value) {
				current = current.leftChild;
			}else {
				current = current.rightChild;
				isLeftChild = false;
			}
			//如果查不到
			if(current==null) {
				return false;
			}
		}
		//删除叶子节点  该节点没有子节点
		if(current.leftChild == null && current.rightChild==null) {
			//判断子节点是否是根节点
			if(current==root) {
				root = null;
			}else if(isLeftChild) {
				//如果是
				parent.leftChild=null;
			}else {
				parent.rightChild=null;
			}
			//删除只有一个节点 左节点
		}else if(current.rightChild==null) {
			//判断子节点是否是根节点
			if(current == root) {
				root =current.leftChild;
			}else if(isLeftChild) {
				parent.leftChild=current.leftChild;
			}else {
				parent.rightChild = current.leftChild;
			}
			//删除只有一个节点 右节点
		}else if(current.leftChild==null) {
			if(current == root) {
				root = current.rightChild;
			}else if(isLeftChild) {
				parent.leftChild = current.rightChild;
			}else {
				parent.rightChild = current.leftChild;
			}
		}else {
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			}else if(isLeftChild){
				parent.leftChild = successor;
			}else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	/*
	 * 获得中序后继节点
	 * 删除的节点有两个子节点的时候就要找到
	 * 后续中继节点
	 * 该节点在左边树的左子节点
	 * 比要删除的节点大 但是是大的最少的
	 */
	public Node getSuccessor(Node delNode) {
		Node successor = delNode;
		Node successPar = delNode;
		Node current = delNode.rightChild;
		
		while(current!=null) {
			successPar = successor;
			successor = current;
			current = current.leftChild;
		}
		//左边
		if(successor!=delNode.rightChild) {
			successPar.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	/*
	 * 前序遍历
	 * 1.访问根节点
	 * 2.前序遍历左子树
	 * 3.前序遍历右子树
	 */
	public void frontOrder(Node localNode) {
		if(localNode != null) {
			//访问根节点
			System.out.println(localNode.data+"," +localNode.sData);
			//前序遍历左子树
			frontOrder(localNode.leftChild);
			//前序遍历右子树
			frontOrder(localNode.rightChild);
		}
	}
	/*
	 * 中序遍历(有序,用的最多)
	 * 1.中序遍历左子树
	 * 2.访问根节点
	 * 3.中序遍历右子树
	 */
	public void midOrder(Node localNode) {
		if(localNode != null) {
			//中序遍历左子树
			midOrder(localNode.leftChild);
			System.out.println(localNode.data + "," + localNode.sData);
			midOrder(localNode.rightChild);
			
		}
		
	}
	
	/*
	 * 后序遍遍历
	 * 1.后序遍历左子树
	 * 2.后序遍历右子树
	 * 3.访问根节点
	 */
	public void afOrder(Node localNode) {
		if(localNode != null) {
			afOrder(localNode.leftChild);
			afOrder(localNode.rightChild);
			System.out.println(localNode.data+"," +localNode.sData);
		}
	}
}



















