package T1;
/*
  冒泡法排序的思路： 
第一步：从第一位开始，把相邻两位进行比较 
如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的 
第二步： 再来一次，只不过不用比较最后一位 
以此类推
 * */
public class demo11 {

	public static void main(String[] args) {
		int []a = new int[10];//更改数字即可改变数组大小
		int i,j,k;
		System.out.print("排序前:");
		for(k=0;k<a.length;k++)
		{
			a[k]=(int)(Math.random()*100);
			
			System.out.print(a[k]+" ");
		}
		System.out.println();
		for(i=0;i<a.length;i++)// 循环5次
		{
			for(j=0;j<a.length-1-i;j++) // 4 3 2 1 
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.print("排序后:");
		for(k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}

	}

}
