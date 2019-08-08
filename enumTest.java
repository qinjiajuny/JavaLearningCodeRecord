package T1;

public class enumTest {

	public static void main(String[] args) {
		//利用增强型循环遍历枚举
		for(HeroType h:HeroType.values ())
		{
			System.out.println(h);
		}
		System.out.println("-------------");
		HeroType h = HeroType.SUPPORT;
        switch (h) {
        case SUPPORT:
            System.out.println("辅助");
            break;
        case TANK:
            System.out.println("坦克");
            break;
        case ADCARRY:
            System.out.println("射手");
            break;
        case ASSASSIN:
            System.out.println("刺客");
            break;
        case WIZARD:
            System.out.println("法师");
            break;
        }

	}

}
