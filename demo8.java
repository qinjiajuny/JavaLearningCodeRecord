package T1;
/*
 * 练习-黄金分割点
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
分母和分子不能同时为偶数
分母和分子 取值范围在[1-20]
 * */
public class demo8 {

	public static void main(String[] args) {
		int molecule=0;//分子
		int denominator=0;//分母
		double result ,temp =0.0;
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=20;j++)
			{
				if(i%2==0&&j%2==0)
					continue;
				temp=(double)(i/j);
				
			}
		}


	}

}
