package T1;
/*
 * 循环判断季节和平闰年
 * */
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
//		
//		for (int counter = 0; counter <= 10; counter++){
//	        System.out.printf("%d! = %d\n", counter,
//	        factorial(counter));
//	    }
//	    }
//	    public static long factorial(long number) {
//	        if (number <= 1)
//	            return 1;
//	        else
//	            return number * factorial(number - 1);
//	    }
         
		System.out.println("请输入月份：");
		int month = in.nextInt();
		switch(month)
		{
		case 1:
		case 2:
		case 3:
			System.out.println("春季");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("夏季");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("秋季");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("冬季");
			break;
		default:
			System.out.println("输入有误");
		}
		System.out.println("请输入年份：");
		int year = in.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(year+"是闰年");
		}
		else 
			System.out.println(year+"是平年");
	
	}
}

		

	


