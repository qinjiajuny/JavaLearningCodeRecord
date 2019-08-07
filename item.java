package T1;
//物品类Item 有属性 name,price
public class item {
	String name;
	int price;
	
	
	 //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }
	
	//构造方法即与类的名字完全一样，但没有返回值
	public item()
	{
		//System.out.println("我是item的构造方法");
	}
	
	public item(String name)
	{
		System.out.println(name+"我是item的构造方法带参数");
	}
	public static void main(String[] args)
	{
		item i = new item();//实例化一个对象会先去调用构造方法
//		System.out.println("我是main方法");
		
		i.name = "多兰剑";
		//直接打印对象，会显示该对象在内存中的虚拟地址
        System.out.println("打印对象看到的虚拟地址："+i);
        i.showAddressInMemory();
		
	}

}
