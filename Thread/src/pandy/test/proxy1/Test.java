/*
 * package pandy.test.proxy1;
 * 
 * import java.io.ObjectInputStream.GetField; import java.lang.reflect.Proxy;
 * 
 * public class Test { public static void main(String[] args) {
 * 
 * 
 * //����Ҫʱ��hello��ʱ�� ʹ��jdk�Ķ�̬�����ȡhello�Ĵ������ Hello hello =
 * (Hello)Proxy.newProxyInstance(//����һ���µĴ���ʵ�� getClass().getClassLoader(),//�������
 * new Class<?>[] {Hello.class},//������Ҫʵ�ֵĽӿ� new LogInvocationHandler(new
 * HelloImp()));//�������õ�ʵ�ʴ�����
 * System.out.println(hello.sayHello("You are so preety!")); } }
 */