package day04;
//数组 静态初始化
public class Day04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*数组定义格式
		//int [] arr = new int[2];//2：数组长度
		//int arr [] = new int[2];//同上 另一种格式
		//格式2 静态初始化格式
		//int [] arr = new int []{3,1,6,5,4};
		//简化
		int[] arr = {3,1,6,5,4};//直接确定元素
		
		int[] arr = new int[5];//分别赋值
		arr[0] = 90;
		arr[1] = 80;
		//System.out.println(arr[2]);/6
		*/
		
		/*定义数组易错点*/
		int [] arr = new int[3];
		System.out.println(arr[2]);//打印得0，默认初始化为0
		//System.out.println(arr[3]);//打印错误
		//ArrayIndexOutOfBoundsException:3:操作数组时，访问到了数组中不存在的角标
		
		arr = null;//arr都不指向数组地址
		//System.out.println(arr[1]);//错误
		//NullPointerException 空指针异常，当引用没有任何指向值为null的情况，该引用还在用于操作实体
		
		System.out.println("Hello World!");


	}

}
