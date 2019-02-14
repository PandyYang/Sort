package pandy.test.proxy1;
/*
 * 动态代理
 * 实现一个incocationHandler 方法调用会被转发到该类的invoke()方法
 * 然后在需要hello的时候 使用JDK动态代理获取Hello的代理对象
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class LogInvocationHandler implements InvocationHandler {
	private Hello hello;
	public LogInvocationHandler(Hello hello) {
		// TODO Auto-generated constructor stub
		this.hello = hello;
	}
	//试下你一个invocationHandler 方法调用会被转发到该类的invoke()方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if("sayHello".equals(method.getName())) {
			System.out.println(Arrays.toString(args));
		}
		return method.invoke(hello, args);
	}
			

}
