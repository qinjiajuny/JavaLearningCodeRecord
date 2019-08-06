package T1;
/*
  天朝有一个乞丐姓洪，去天桥要钱
第一天要了1块钱
第二天要了2块钱
第三天要了4块钱
第四天要了8块钱
以此类推
问题： 洪乞丐干10天，收入是多少？
  */
public class demo5 {

	public static void main(String[] args) {
		int sum=0;
		int money =0;
		int day;
		for( day=1;day<=10;day++)
		{
			money =(int)(Math.pow(2,day-1));
			System.out.println("第"+day+"天:"+money+"块钱");
			sum+=money;
		}
		System.out.println("十天收入："+sum+"块钱");

	}

}
