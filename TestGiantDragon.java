package T1;

public class TestGiantDragon {

	public static void main(String[] args) {
		 //通过new实例化会报错
//      GiantDragon g = new GiantDragon();
         
        //只能通过getInstance()得到对象
         
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();
         
        //都是同一个对象
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g1==g2);
        System.out.println(g1==g3);


	}

}
