package pandy.test.proxy;

public class Client {
	public static void main(String[] args) {
		
		HelloService helloService = new HelloServiceImpl();//����ת��
		
		HelloService helloServiceProxy = new HelloServiceProxy(helloService);//����ʵ�� ����������������봫��ֵ
		//��ֵ�Ѿ�ͨ������ת�ͻ��
		System.out.println(helloServiceProxy.echo("hello!"));
		
	}
}
