package pandy.test.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void testGetParentField() throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class c1 = Class.forName("pandy.test.");//��������Ҳ���������
		//��ȡ�����˽�е�����
		System.out.println(getFieldValue(c1.newInstance(),"privateField"));//��һ��������ʵ�� �ڶ���ʵ�����ֶ�  ��ȡָ��ʵ�����ֶ���
	}
	
	public static Field getDeclareField(Object obj,String fieldName) {
		Field field = null;
		Class c = obj.getClass();
		for(;c!=Object.class;c=c.getSuperclass()) {//û�е������ ��һֱ����Ѱ�� ֱ���ҵ�����Object
			try {
				field = c.getDeclaredField(fieldName);//��������������,����private,�����ĺͼ̳���
				field.setAccessible(true);//Field.setAccessible(true)֮�󣬼�ʹ��final�ؼ��ֱ�ʾ��������Ҳ�����з���Ȩ�ޣ�
				return field;//������·���еĴ��ڵ�����ȫ����ȡ�� Ȼ�󷵻�
			}catch(Exception e) {
				
			}
		}
		return null;
	}
	public static Object getFieldValue(Object object,String fieldName) throws IllegalArgumentException, IllegalAccessException {
		Field field = getDeclareField(object, fieldName);//���������Լ��ֶε�����
		return field.get(object);//���������е��ֶ���
	}
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		ReflectionTest rt = new ReflectionTest();
		rt.testGetParentField();
		rt.getDeclareField(Parent.class, "publicField");
	}
}
