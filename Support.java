package T1;
/*
 设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
对Support的heal方法进行重载
heal() 
heal(Hero h) //为指定的英雄加血
heal(Hero h, int hp) //为指定的英雄加了hp的血*/
public class Support extends Hero {
	void heal()
	{
		System.out.println(name+"进行了治疗");
	}
	void heal(ADC adc)
	{
		System.out.println(name+"对"+adc.name+"进行了治疗");
	}
	void heal(ADC adc,int heal)
	{
		System.out.println(name+"对"+adc.name+"进行了"+heal+"治疗");
	}


	public static void main(String[] args) {
		Support soraka = new Support();
		soraka.heal();//未赋name值Java默认赋值为null
		Support janna = new Support();
		janna.name = "迦娜";
		janna.heal();
		ADC lucia = new ADC();//实例化一个adc并赋name
		lucia.name="卢锡安";
		janna.heal(lucia);
		janna.heal(lucia,200);
		

	}

}
