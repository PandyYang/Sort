package pandy.test.proxy1;
/*
 * 静态代理
 * 代理和实现类必须同时实现接口
 */
public class StaticProxiedHello implements Hello {
	private Hello hello = new HelloImp();
	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return hello.sayHello(str);
	}
	
}
