package pandy.test.proxy1;
/*
 * ��̬����
 * �����ʵ�������ͬʱʵ�ֽӿ�
 */
public class StaticProxiedHello implements Hello {
	private Hello hello = new HelloImp();
	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return hello.sayHello(str);
	}
	
}
