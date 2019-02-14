package pandy.test.thread;



public class ThreadLocalTest {
	private ThreadLocal<Integer> num = new ThreadLocal<Integer>() {
		protected Integer initalValue() {
			return 0;
		}
	};
	Integer getNextNum() {
		num.set(num.get()+1);
		return num.get();
	}
	public static void main(String[] args) {
		ThreadLocalTest th = new ThreadLocalTest();
		Test t1 = new Test(th);
		Test t2 = new Test(th);
		Test t3 = new Test(th);
		t1.start();
		t2.start();
		t3.start();
	}
}
