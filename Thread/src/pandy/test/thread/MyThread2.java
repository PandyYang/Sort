package pandy.test.thread;
/*
 * 通过实现runnable接口实现多线程
 * 如果继承thread 那么每个每个线程单独买了五张票 
 * 即独立完成买票任务 最终买了15张票
 * 但是实际的应用中需要让线程去共同完成任务
 * 比如实现runnable接口 会让三个线程共同去完成买五张票的任务
 * 相比与thread runnable有以下的优点
 * 可以避免因为java 的单继承特性带来的局限性
 * 增强程序的健壮性 代码能被多个线程共享 代码互数据是独立的
 * 适合多个相同程序代码的线程区处理同一资源的情况
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
