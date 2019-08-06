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
	public static void main(String[] args) {
		
		Hero virus = new Hero();
		virus.name = "维鲁斯";
		virus.hp = 660;
		virus.movespeed = 335;
		
		Hero  soraka = new Hero();
		soraka.name = "索拉卡";
		soraka.hp = 550;
		soraka.movespeed = 330;
//		System.out.println(virus.name);
//		System.out.println(soraka.hp);
		System.out.println(virus.movespeed);
		virus.AddMoveSpeed(30);
		System.out.println(soraka.GetHp());
		System.out.println(virus.movespeed);
		//System.out.println("修改1");
	}

}
