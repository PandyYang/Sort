package pandy.test.proxy;

public class Test {
	public void testJdkProxy() {
		JdkProxyExample jdk = new JdkProxyExample();
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloServiceImpl());
		proxy.sayHelloWorld();
	}
}
