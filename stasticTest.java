package T1;

public class stasticTest {
	//对象属性的初始化的三种方式的优先级为
	//声明初始化&初始化块>构造方法
	//声明初始化跟初始化块取决于谁在前谁在后
	{
    	name = "third hero";
    }
	
	public String name = "first hero"; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性,所有的对象共享这一属性
    
//    public stasticTest()
//    {
//    	name = "second hero";
//    }
    
    public void die()//实例方法/对象方法/非静态方法
    				//必须有对象才能调用
    {
    	System.out.println("die!");
    }
    static public void kill()//类方法，静态方法
    {						//通过类名就可以调用
    	System.out.println("kill");
    }
     
    public static void main(String[] args) {
    	stasticTest garen =  new stasticTest();
    	System.out.println(garen.name);
           //garen.name = "盖伦";
//           garen.die();
//           garen.kill();
//           stasticTest.kill();//不需要对象实例化就可以调用
           stasticTest.copyright = "版权由Riot Games公司所有";
            
           System.out.println(garen.name);
           System.out.println(garen.copyright);
           
          
            
           stasticTest teemo =  new stasticTest();
           teemo.name = "提莫";
           System.out.println(teemo.name);    
           System.out.println(teemo.copyright);
           System.out.println(stasticTest.copyright);
//           System.out.println(stasticTest.name);//需是静态属性stastic才能这样访问(类名.属性)
//           garen.copyright = "由腾讯所有";//后面的都被修改了
//           System.out.println(garen.copyright);
//           System.out.println(teemo.copyright);
//           System.out.println(stasticTest.copyright);
    }
}
