package T1;
/*这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例*/
/*懒汉式单例模式与饿汉式单例模式不同，只有在调用getInstance的时候，才会创建实例
*/
public class GiantDragon {
	//私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){
         
    }
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    
//    private static GiantDragon instance = new GiantDragon();
     
    //public static 方法，提供给调用者获取12行定义的对象
    //饿汉
//    public static GiantDragon getInstance(){
//    	
//        return instance;
//    }
    //懒汉
  //public static 方法，返回实例对象
    
  //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GiantDragon instance;
      
    public static GiantDragon getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance = new GiantDragon();
        }
        //返回 instance指向的对象
        return instance;
    }

	public static void main(String[] args) {
		

	}

}
