package T1;
/*
 合并数组练习：
 首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
然后准备第三个数组，第三个数组的长度是前两个的和
通过System.arraycopy 把前两个数组合并到第三个数组中
 * */
public class demo13 {
	public static void main(String[] args)
	{
		//5~10的随机数
		//int num = min + (int)(Math.random() * (max-min+1));
		int random1 = 5+(int) (Math.random()*6);
		int random2 = 5+(int) (Math.random()*6);
		System.out.println("random1:"+random1);
		System.out.println("random2:"+random2);
		int []a = new int[random1];
		int []b = new int[random2];
		int k;
		for(k=0;k<random1;k++)//a数组读入随机数
		{
			a[k]=(int)(Math.random()*101);
			
		}
		System.out.println("a数组：");
		for(int e1:a)
		{
			System.out.print(e1+" ");
		}
		System.out.println();
		for(k=0;k<random2;k++)//b数组读入随机数
		{
			b[k]=(int)(Math.random()*101);
			
		}
		System.out.println("b数组：");
		for(int e2:b)
		{
			System.out.print(e2+" ");
		}
		int []c = new int[random1+random2];
		System.arraycopy(a,0,c,0,random1);//先将a数组复制到c数组
		System.arraycopy(b,0,c,random1,random2);
		//将b数组复制到c数组 位置是random1 
		//刚开始写成random-1会导致原本a数组最末位置的数被b数组的首位顶替
		System.out.println();
		System.out.println("c数组：");
		for(int e2:c)
		{
			System.out.print(e2+" ");
		}
	
	}

}
