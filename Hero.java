package T1;
/*成员属性方法练习——以lol英雄
 * */
public class Hero {
	String name;
	float hp;
	int movespeed;
	void UnStoppble()
	{
		System.out.println("无人可挡了!");
	}
	float GetHp()
	{
		return hp;
	}
	void AddMoveSpeed(int speed)
	{
		movespeed = movespeed+speed;
	}
	 public Hero(String name, float hp) {
	        this.name = name;
	        this.hp = hp;
	    }
	 // 攻击一个英雄，并让他掉damage点血
	    public void attack(Hero hero, int damage) {
	        hero.hp = hero.hp - damage;
	    }
	    //回血
	    public void huixue(int xp){
	        hp = hp + xp;
	        //回血完毕后，血瓶=0
	        xp=0;
	    }
	 
	    public Hero()
	    {
	    	
	    }
	//构造方法的重载
//	public Hero()//如果构造方法带参数且没有类里没有明显的写出构造方法会出错
//				//即若要使用带参数的构造方法此无参数的构造方法需写出来
//	{
//		
//	}
//	public Hero(String heroname)
//	{
//		name = heroname;//将实例化赋的参数heroname传给对象的name属性
//		System.out.println("一个参数的构造方法");
//		System.out.println(this.name);
//	}
	
//	public Hero(String heroname,float hp)
//	{
//		this(heroname);//调用带一个参数的构造方法
//		name = heroname;//将实例化赋的参数heroname传给对象的name属性
//		this.hp = hp;  //将附带的参数hp赋值给这个实例化对象的hp属性
//		System.out.println("两个参数的构造方法");
//		System.out.println(this.name+this.hp);
//	}
	    //复活
	    public void revive(Hero h){
	        h = new Hero("提莫",383);//h跟temmo是两个对象 调试时在jvm里的id不一样
	        
	    }
	 
	public static void main(String[] args) {
		Hero teemo =  new Hero("提莫",383);
		 //受到400伤害，挂了
		 System.out.println(teemo.hp);
		 System.out.println(teemo);
        teemo.hp = teemo.hp - 400;
        System.out.println(teemo.hp);
        teemo.revive(teemo);
        System.out.println(teemo);//参数hero h 与teemo的地址还是一样
       
         
        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp);
        //血瓶，其值是100
//        int xueping = 100;
//         
//        //提莫通过这个血瓶回血
//        System.out.println(teemo.hp);
//        teemo.huixue(xueping);
//         
//        System.out.println(xueping);
//        System.out.println(teemo.hp);
//		 Hero teemo = new Hero("提莫", 383);
//	     Hero garen = new Hero("盖伦", 616);
//	     garen.attack(teemo, 100);
//	     System.out.println(teemo.hp);
//		Hero virus = new Hero();
//		virus.name = "维鲁斯";
//		virus.hp = 660;
//		virus.movespeed = 335;
//		
//		
//		Hero  soraka = new Hero("索拉卡");
//		
//		Hero temmo = new Hero("提莫",220);
//		soraka.name = "索拉卡";
//		soraka.hp = 550;
//		soraka.movespeed = 330;
//		System.out.println(virus.name);
//		System.out.println(soraka.hp);
//		System.out.println(virus.movespeed);
//		virus.AddMoveSpeed(30);
//		System.out.println(soraka.GetHp());
//		System.out.println(virus.movespeed);
		
		
	}

}
