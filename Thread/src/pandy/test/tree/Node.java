package pandy.test.tree;
/*
 * �������Ľڵ�
 */
public class Node {
	//������
	public long data;
	//������
	public String sData;
	//���ӽڵ�
	public Node leftChild;
	//���ӽڵ�
	public Node rightChild;
	
	/*
	 * ���췽��
	 */
	public Node(long data,String sData) {
		this.data=data;
		this.sData=sData;
	}
}
