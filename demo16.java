package T1;
import java.util.Arrays;
/*
 * 练习-二维数组排序
首先定义一个5X8的二维数组，然后使用随机数填充满。
借助Arrays的方法对二维数组进行排序。
参考思路：
先把二维数组使用System.arraycopy进行数组复制到一个一维数组
然后使用sort进行排序
最后再复制回到二维数组。
 * */
public class demo16 {

	public static void main(String[] args) {
		int[][] a=new int[3][4];//减少数据量
		int i,j;
		System.out.println("排序前：");
		for(i=0;i<a.length;i++)//读入数据并输出
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=(int)(Math.random()*101);
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		//二维数组的length长度是行
		System.out.println(a.length);
		//列的长度
		System.out.println(a[0].length);
		System.out.println("一维数组：");
		//创建一维数组来存放二维数组
		int[] temp = new int[a.length*a[0].length];
		//存放二维数组逐行存放到一维数组
		for (i = 0; i < a.length; i++) { 
			//复制的位置是每列的末尾 复制的长度是各列的长度
            System.arraycopy(a[i],0,temp,a[i].length*i,a[i].length);
        }
		for(int e:temp)
		{
			System.out.print(e+" ");
		}
		//将一位数组排序
		System.out.println();
		System.out.println("排序后：");
		Arrays.sort(temp);
		//再复制回二维数组
		for(i=0;i<a.length;i++)
		{
			//数组源按列算每次复制的开始位置是一列的末尾 复制的数组按一列一列复制，长度是每列的长度
			System.arraycopy(temp,i*a[i].length,a[i],0,a[i].length);
		}
		for(i=0;i<a.length;i++)//输出排序后的二维数组
		{
			for(j=0;j<a[i].length;j++)
			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
