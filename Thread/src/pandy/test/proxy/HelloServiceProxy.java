package pandy.test.proxy;

import java.util.Date;

public class HelloServiceProxy implements HelloService {
	
	private HelloService helloService;//创建实例
	
	public HelloServiceProxy(HelloService helloService) {
		this.helloService=helloService;//确保在类创建的时候 就能将 代理必须实现同一接口 代理对接口进行注入和构造初始 set方法是干什么的
	}
	
	//set方法对外提供访问方法
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
