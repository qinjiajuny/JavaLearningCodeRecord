package T1;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args)
	{
		int sum =0;
		int price = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("输入支付的钱：");
		sum = in.nextInt();
		System.out.print("输入物品价格：");
		price  = in.nextInt();
		System.out.println("找零："+(sum-price));
	}

}
