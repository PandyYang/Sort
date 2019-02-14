package pandy.test.thread;
/*
 * 继承thread类实现多线程
 * 
 */
public class MyThread extends Thread {
	private int ticket = 5;
	public void run() {
		for(int i=0;i<10;i++) {
			if(ticket>0) {
				System.out.println("ticket = "+ticket--);
			}
		}
	}
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		new MyThread().start();
	}
}
