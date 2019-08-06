package T1;

public class demo12 {

	public static void main(String[] args) {
		int values [] = new int[]{18,62,68,82,65,9};
		 int []a = new int[4];
		 System.arraycopy(values, 2, a, 1, 3);//源数组 读取位置  目标数组 复制位置 复制长度
		 for(int e:a)//读取出来
		 {
			 System.out.print(e+" ");
		 }
        //常规遍历
//        for (int i = 0; i < values.length; i++) {
//            int each = values[i];
//            System.out.print(each+" ");
//        }
//         System.out.println();
//        //增强型for循环遍历
//        for (int each : values) {
//            System.out.print(each+" ");
//        }
//        //用增强型for循环找出最大的那个数
//        int max=values[0];
//        for(int e:values)
//        { 
//        	
//        	if(max<e) 
//        		max =e;
//        }
//        System.out.println("最大值是"+max);

	}

}
