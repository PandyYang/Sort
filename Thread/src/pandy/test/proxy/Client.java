package pandy.test.proxy;

public class Client {
	public static void main(String[] args) {
		
		HelloService helloService = new HelloServiceImpl();//向上转型
		
		HelloService helloServiceProxy = new HelloServiceProxy(helloService);//创建实例 构造器决定了其必须传入值
		//该值已经通过向上转型获得
		System.out.println(helloServiceProxy.echo("hello!"));
		
	}
}
