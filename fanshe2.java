package T1;

import java.lang.reflect.Constructor;

public class fanshe2 {

	public static void main(String[] args) throws Exception {
		//获取到相应的Class对象
		Class clazz = Class.forName("T1.Person");
		
		//通过Class对象获取对应的构造方法
		Constructor[]cs =  clazz.getConstructors();//getConstructors()获取一个类的所有公共构造方法，返回的是一个Constructor的数组
		//遍历输出一下这个数组
		System.out.println("getConstructors获取到的构造方法：");
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
		System.out.println("\ngetDeclaredConsructors获取到的构造方法:");
		Constructor[]cs2 = clazz.getDeclaredConstructors();
		for (Constructor constructor : cs2) {
			System.out.println(constructor);
			
		}
		
		System.out.println("\ngetConsructor获取到的构造方法:");
		//getConstructo获取单个指定的构造方法,返回一个Constructor对象
		Constructor cs3 = clazz.getConstructor(int.class,String.class);
		Person p  = (Person) cs3.newInstance(999,"小城"); // newInstance()创建一个对象
		System.out.println(p);
//		Constructor cs4 = clazz.getConstructor(int.class);
//		System.out.println(cs4);
//		Constructor cs5 = clazz.getConstructor(String.class);
//		System.out.println(cs5);
		
		//只有空指数的构造方法可以输出
//		Constructor cs6 = clazz.getConstructor(null);
//		System.out.println(cs6);
		Constructor cs7= clazz.getDeclaredConstructor(null);
		System.out.println(cs7);
		//暴力反射
		//java.lang.IllegalAccessException: Class T1.fanshe2 can not access a member of class T1.Person with modifiers "private"
		cs7.setAccessible(true);//设置访问权限为true
		Person p1  =(Person) cs7.newInstance(null);
		System.out.println(p1);
		
		
		

	}

}
