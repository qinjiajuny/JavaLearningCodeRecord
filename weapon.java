package T1;
/*
武器类： Weapon不继承Item的写法
独立设计 name和price属性
同时多了一个属性 damage 攻击力
 * */
public class weapon extends item {
	
    int damage; //攻击力
    public static void main(String[] args)
    {
    	weapon BFSword= new weapon();//实例化武器暴风大剑
    	BFSword.name = "暴风大剑";//name和price属性是从item处继承的可以直接使用
    	BFSword.price = 1300;
    	BFSword.damage = 50;
    	System.out.println(BFSword.name);
    	System.out.println(BFSword.price);
    	System.out.println(BFSword.damage);
    	
    }

}

