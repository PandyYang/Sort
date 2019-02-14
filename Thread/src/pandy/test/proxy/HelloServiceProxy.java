package pandy.test.proxy;

import java.util.Date;

public class HelloServiceProxy implements HelloService {
	
	private HelloService helloService;//����ʵ��
	
	public HelloServiceProxy(HelloService helloService) {
		this.helloService=helloService;//ȷ�����ഴ����ʱ�� ���ܽ� �������ʵ��ͬһ�ӿ� ����Խӿڽ���ע��͹����ʼ set�����Ǹ�ʲô��
	}
	
	//set���������ṩ���ʷ���
	public void setHelloServiceProxy(HelloService helloService) {
		this.helloService=helloService;
	}
	
	@Override
	public String echo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("before calling echo()");
		String result = helloService.echo(msg);
		System.out.println("after calling echo()");
		return result;
	}
	
	@Override
	public Date getTime() {
		System.out.println("before calling getTime()");
		// TODO Auto-generated method stub
		Date date = helloService.getTime();
		System.out.println("after calling getTime");
		return date;
	}
}
