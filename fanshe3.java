package T1;

import java.lang.reflect.Method;

/*
通过Class对象获取到对应的方法。
在反射技术中使用了Method类描述了方法的。
*/
public class fanshe3 {

	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("T1.Person");
		
		//获取所有的公共方法包括父类的方法,返回一个Method类型的数组
		Method[] mt = clazz.getMethods();
		//获取所有的方法但不会返回父类的那些方法
		Method[] mt1 = clazz.getDeclaredMethods();
		for (Method method : mt1) {
			System.out.println(method);
			
		}
		
		Person p = new Person(001,"张三");
		System.out.println("=======获取特定公共的方法========");
		Method m = clazz.getMethod("eat", null);
		System.out.println(m);
		//invoke 执行一个方法。 第一个参数：方法的调用对象。 第二参数： 方法所需要的参数。
		m.invoke(p, null);
		System.out.println("=======获取特定所有的方法========");
		Method m1 = clazz.getDeclaredMethod("sleep", int.class);
		m1.setAccessible(true);
		m1.invoke(p, 8);
		System.out.println(m1);
		System.out.println("=======传递数组========");
		Method m2 = clazz.getMethod("sum",int[].class);
		//静态方法可以第一个参数可以不用传递对象
		m2.invoke(null,new int[] {1,2,5,67,8});
		System.out.println(m2);
		
		

	}

}
