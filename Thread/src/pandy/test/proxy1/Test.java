/*
 * package pandy.test.proxy1;
 * 
 * import java.io.ObjectInputStream.GetField; import java.lang.reflect.Proxy;
 * 
 * public class Test { public static void main(String[] args) {
 * 
 * 
 * //在需要时候hello的时候 使用jdk的动态代理获取hello的代理对象 Hello hello =
 * (Hello)Proxy.newProxyInstance(//创建一个新的代理实例 getClass().getClassLoader(),//类加载器
 * new Class<?>[] {Hello.class},//代理需要实现的接口 new LogInvocationHandler(new
 * HelloImp()));//方法调用的实际处理者
 * System.out.println(hello.sayHello("You are so preety!")); } }
 */