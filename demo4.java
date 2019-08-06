package T1;
import java.util.Scanner;
public class demo4 {
	//两种方法计算阶乘
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int N = in.nextInt();
		int num = N;
		//递归法
		System.out.println(N+"!="+f(N));
		//正常计算
		if(N==0||N==1)
		{
			num=1;
		}
		while(N>1)
		{
			num=num*(N-1);
			N--;
		}
		System.out.println(num);
		
		
	}
	 public static int f(int n)
	{
		if(n<=1)
			return 1;
		else
		return n*f(n-1) ;
	}

}
