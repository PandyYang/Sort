package pandy.test.proxy1;
/*
 * ��̬����
 * ʵ��һ��incocationHandler �������ûᱻת���������invoke()����
 * Ȼ������Ҫhello��ʱ�� ʹ��JDK��̬�����ȡHello�Ĵ������
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
	//������һ��invocationHandler �������ûᱻת���������invoke()����
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if("sayHello".equals(method.getName())) {
			System.out.println(Arrays.toString(args));
		}
		return method.invoke(hello, args);
	}
			

}
