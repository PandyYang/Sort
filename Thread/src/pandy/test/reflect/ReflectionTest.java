package pandy.test.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void testGetParentField() throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class c1 = Class.forName("pandy.test.");//虚拟机查找并加载子类
		//获取父类的私有的属性
		System.out.println(getFieldValue(c1.newInstance(),"privateField"));//第一个参数是实例 第二个实例是字段  获取指定实例的字段名
	}
	
	public static Field getDeclareField(Object obj,String fieldName) {
		Field field = null;
		Class c = obj.getClass();
		for(;c!=Object.class;c=c.getSuperclass()) {//没有到达根类 就一直向上寻找 直到找到根类Object
			try {
				field = c.getDeclaredField(fieldName);//获得类的所有属性,包括private,声明的和继承类
				field.setAccessible(true);//Field.setAccessible(true)之后，即使是final关键字标示过得属性也可以有访问权限！
				return field;//将遍历路径中的存在的属性全部获取到 然后返回
			}catch(Exception e) {
				
			}
		}
		return null;
	}
	public static Object getFieldValue(Object object,String fieldName) throws IllegalArgumentException, IllegalAccessException {
		Field field = getDeclareField(object, fieldName);//传入类型以及字段的名称
		return field.get(object);//返回区域中的字段名
	}
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		ReflectionTest rt = new ReflectionTest();
		rt.testGetParentField();
		rt.getDeclareField(Parent.class, "publicField");
	}
}
