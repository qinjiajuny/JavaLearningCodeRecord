package T1;
/*
 * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
找出这个二维数组里，最大的那个值，并打印出其二维坐标

 * */
public class demo14 {

	public static void main(String[] args) {
//	试验公式
//		for(int i=0;i<100;i++)
//		System.out.println(5+(int)(Math.random()*5));

		int[][]a = new int[5][5];//创建一个5*5数组
		for(int i=0;i<5;i++)//用随机数对数组赋值
		{
			for(int j=0;j<5;j++)
			{
				a[i][j]=(int)(Math.random()*101);
			}
		}
		for(int i=0;i<5;i++)//读出数组
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		int max = a[0][0];
		int h=0,l=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(max<a[i][j])
				{
					max = a[i][j];
					l=i;
					h=j;
				}
				
			}
		}
		System.out.println("最大值是："+max);
		System.out.println("坐标是["+l+"]"+"["+h+"]");
	}

}
