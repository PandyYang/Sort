package pandy.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
	//��ʵ����
	private Object target = null;
	
	/*
	 * ��������������ʵ����Ĵ����ϵ �����ش������
	 * newProxyInstance����������
	 * ����1 ������� ������target������������
	 * ����2 �����ɵĶ�̬��������¹�����Щ�ӿ���
	 * ����3 ����ʵ�ַ����߼��Ĵ�����
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	/*
	 * �������߼�
	 * proxy �������
	 * method ��ǰ���ȷ���
	 * args ��ǰ��������
	 * return ���ش�����
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��������߼�����");
		System.out.println("�ڵ�����ʵ����֮ǰ�ķ���");
		Object obj = method.invoke(target, args);
		System.out.println("�ڵ�����ʵ����֮��ķ���");
		return obj;
	}

}
