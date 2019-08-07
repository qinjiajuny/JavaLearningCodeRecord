package T1;
/*设计一个类Armor护甲
继承Item类，并且额外提供一个属性ac: 护甲等级 int类型

实例化出两件护甲
名称 价格 护甲等级
布甲 300 15
锁子甲 500 40*/

//调试的时候会运行继承的类
public class armor extends item {
	int ac;//新增的护甲等级属性
	

	public static void main(String[] args) {
		armor bujia = new armor();//实例化布甲和锁子甲
		armor suozijia = new armor();
		bujia.name = "布甲";
		bujia.price = 300;
		bujia.ac = 15;
		suozijia.name = "锁子甲";
		suozijia.price = 500;
		suozijia.ac = 50;
		

	}

}
