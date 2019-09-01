package T1;

public class Person {
	int id;
	String name;
	public Person(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}
	private Person(String name) {
//		super();
//		this.id = id;
		this.name = name;
	}
	private Person()
	{}
	@Override
	public String toString() {
	
		return " 编号："+ this.id +" 姓名："+ this.name;
	}
	public void eat()
	{
		System.out.println(name+"吃东西");
	}
	
	private static void sleep(int num){
		System.out.println("明天睡上"+num+"小时");
	}
	
	public static void sum(int[] arr)
	{
		System.out.println("数组长度是:"+arr.length);
	}
		
		
		

}
