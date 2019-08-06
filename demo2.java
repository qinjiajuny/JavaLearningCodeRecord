package T1;
/*
 * 猜数字游戏
 * */
import java.util.Scanner;
public class demo2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number =(int) (Math.random()*100+1);
		int a;
		System.out.println("请首先输入一个数字：");
		a=in.nextInt();
		int count = 0;
		while(a!=number)
		{
			if(a>number)
				System.out.println("大了");
			
			else 
				System.out.println("小了");
			
			count++;
			a = in.nextInt();
		}
		System.out.println("玩了"+count+"次");
		System.out.println(number);
		
		
//		Scanner in = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		int number;
//		number = in.nextInt();
//		while(number!=-1){
//			
//			sum +=number;
//			count++;
//			number = in.nextInt();
//		}
//		double average = 0.0;
//		average = sum /count;
//		System.out.println(sum);
//		System.out.println(count);
//		System.out.println(average);
		
		
}
}
