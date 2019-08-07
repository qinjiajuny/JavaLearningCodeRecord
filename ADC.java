package T1;

public class ADC extends Hero {
	
	
	
	//方法的重载 方法名一样但是参数不一样
	public void attack()
	{
		System.out.println(name+"发起了攻击");
	}
	public void attack(String name)
	{
		System.out.println(name+"发起了攻击");
	}
	public void attack(String name,int damage)
	{
		System.out.println(name+"发起了攻击造成了"+damage+"伤害");
	}


	public static void main(String[] args) {
		ADC MF = new ADC();
		MF.name = "赏金猎人";
		MF.attack();
		ADC Ashe = new ADC();
		Ashe.attack("寒冰射手");//Ashe的name属性为null
		MF.attack("厄运小姐",100);//调试发现对象MF的name还是赏金猎人
		
		

	}

}
