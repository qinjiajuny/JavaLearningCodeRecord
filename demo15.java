package T1;

import java.util.Arrays;

/*
 * 1.Arrays练习——复制，转换成字符串，排序，查找，比较是否一致，填充
 * */
public class demo15 {

	public static void main(String[] args) {
//		int[] a = {1,11,11,14,75};
//		// Arrays.copyOfRange(int[] original, int from, int to)
//		//数组源 开始位置的下标（此下标的值取得到） 终止位置的下标（此处的值取不到）
//		//复制的数组长度=to-form
//		int[] b = Arrays.copyOfRange(a, 0, 4);
//		//Arrays.toSrting()将数组按字符串输出，可以取代用循环逐个读
//		//Arrays.sort()将数组按升序排列
//		System.out.println("排序前：");
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("排序后：");
//		System.out.println(Arrays.toString(a));
		
		//Arrays.binarySearch(int[],int) 查找某个数字在数组的下标
		//第一个参数是数组 第二个是要查找的数字
		//使用之前需要排序 如果有多个的话查找的结果不确定
		//System.out.println("14的下标是"+Arrays.binarySearch(a,11));
		
	
//		System.out.println(arrays);
//		for(int e:b)
//		{
//			System.out.print(e+" ");
//		}
		
		//比较两个数组是否一样
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		int[] c = {1,2,3,4};
		Arrays.fill(a,6);
		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.equals(a,c));
//		System.out.println(Arrays.equals(a,b));
		

	}

}
