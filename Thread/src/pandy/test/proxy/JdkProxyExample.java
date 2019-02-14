package pandy.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
	//真实对象
	private Object target = null;
	
	/*
	 * 建立代理对象和真实对象的代理关系 并返回代理对象
	 * newProxyInstance有三个参数
	 * 参数1 类加载器 采用了target本身的类加载器
	 * 参数2 将生成的动态代理对象下挂在哪些接口下
	 * 参数3 定义实现方法逻辑的代理类
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	/*
	 * 代理方法逻辑
	 * proxy 代理对象
	 * method 当前调度方法
	 * args 当前方法参数
	 * return 返回代理结果
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("进入代理逻辑方法");
		System.out.println("在调度真实对象之前的服务");
		Object obj = method.invoke(target, args);
		System.out.println("在调度真实对象之后的服务");
		return obj;
	}

}
