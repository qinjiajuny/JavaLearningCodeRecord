package T1;
/*
 * 选择法排序的思路： 
把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来 
比较完后，第一位就是最小的 
然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来 
比较完后，第二位就是第二小的 
以此类推
 * */
public class demo10 {

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
		for(i=0;i<a.length;i++)//5个数字第一次排序比较4次，第一次比较是a[0]与后面的数比较
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
			{
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
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
