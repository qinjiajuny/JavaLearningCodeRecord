package T1;
/*
 首先创建一个长度是5的数组
然后给数组的每一位赋予随机整数
通过for循环，遍历数组，找出最小的一个值出来

 * */
public class demo9 {
	public static void main(String[] args)
	{
//		int []a = new int[5];
//		for(int i =0;i<5;i++)
//		{
//			a[i]=(int)(Math.random()*100);
//			System.out.print(" "+a[i]);
//		}
//		int min = a[0];
//		int n =0;
//		while(n<4)
//		{
//			if(min>a[n+1])
//			{			   
//				min=a[n+1];
//			}
//			n++;
//		}
//		System.out.println("最小值是"+min);
		
		
//		int [] a;//声明一个数组， Java声明数组方式与C有区别！！
//		a = new int[5];//创建一个长度为5的数组并让数组a[]指向
//		int [] b = new int[4];//声明并指向
//		int [] c = b;
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[5]=5;
//		System.out.println(a.length);//输出a数组的长度
//		System.out.println(b.length);
//		System.out.println(c.length);
		
// 		int []a = new int[]{1,2,3,4,5};
//		int []a = {1,2,3,4,5};
//		int i=0;
//		while(i<a.length)
//		{
//		System.out.println(a[i]);
//		i++;
//		}
		
/*首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
使用for循环或者while循环，对这个数组实现反转效果
 * */
		int [] a=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			a[i]=(int)(Math.random()*100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=4;i>=0;i--) //i>0的话就忽略了最开始的那个
		{
			System.out.print(a[i]+" ");
		}
	}
}
