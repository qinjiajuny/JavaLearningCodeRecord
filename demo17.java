package T1;

public class demo17 {
    
	    public static void main(String[] args) {
	         
	        //使用一个引用来指向这个对象
	        Hero h1 = new Hero();
	        Hero h2 = h1;  //h2指向h1所指向的对象
	        Hero h3 = h1;
	        Hero h4 = h1;
	        Hero h5 = h4;
	        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象
	        System.out.println(h1);
	        System.out.println(h2);
	        System.out.println(h3);
	        System.out.println(h4); 
	        System.out.println(h5);
	        
	        //重新引用后内存变了
	        Hero h6 = new Hero();
	        System.out.println(h6);
	        h6 = new Hero();
	        System.out.println(h6);
	        
	       
	         
	    }  
}

