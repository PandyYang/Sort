package pandy.test.thread;
/*
 * ͨ��ʵ��runnable�ӿ�ʵ�ֶ��߳�
 * ����̳�thread ��ôÿ��ÿ���̵߳�����������Ʊ 
 * �����������Ʊ���� ��������15��Ʊ
 * ����ʵ�ʵ�Ӧ������Ҫ���߳�ȥ��ͬ�������
 * ����ʵ��runnable�ӿ� ���������̹߳�ͬȥ���������Ʊ������
 * �����thread runnable�����µ��ŵ�
 * ���Ա�����Ϊjava �ĵ��̳����Դ����ľ�����
 * ��ǿ����Ľ�׳�� �����ܱ�����̹߳��� ���뻥�����Ƕ�����
 * �ʺ϶����ͬ���������߳�������ͬһ��Դ�����
 */
public class MyThread2 implements Runnable {
	private int ticket = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(ticket>0) {
				System.out.println("ticket="+ticket--);
			}
		}
	}
	public static void main(String[] args) {
		MyThread2 my = new MyThread2();
		new Thread(my).start();
		new Thread(my).start();
		new Thread(my).start();
	}
}
