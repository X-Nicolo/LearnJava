package day03;
//函数
/*
定义的函数应该放在main函数之外*/
public class Day03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//问题提出；
		/*
		int x=4;
		System.out.println(x*3+5);
		
		int x=6;
		System.out.println(x*3+5);
		
		int x=8;
		int x=10;
		...
		*/
		//问题解决：封装一个功能，利用函数
		//需求：发现以上的运算，因为获取不同数据的运算结果，代码出现了重复。
		//为了提高代码的复用性，对代码进行抽取
		//Java中对功能的定义是通过函数额度形式来体现的。
		
		//需要定义功能，完成一个整数的*3+5的运算
		//1，先明确函数定义的格式
		/*
		修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2，）
		{
			执行语句；
			return 返回值；
		}
		*/
		
		//使用函数
		int x = GetResult(4);//必须在主函数里 返回给主函数
		System.out.println("x="+x);//获取结果 并打印
	}
		//函数GetResult
		public static int GetResult(int num)
		{
			return num * 3 + 5;//决定第一个类型是int
		}
		
		
//		当函数运算后，没有具体的返回值时，这时返回值类型用一个特殊的关键字来标识。
//		该关键字就是void，void代表的是函数没有具体返回值的情况。
//		当函数的返回值类型是void时，函数中的return语句可以省略不写，写了也不算错
//		public static void GetResult(int num)//无返回值 即void
//		{
//			System.out.println(num * 3 + 5);//无返回值 即无返回值类型
//			return;//可以省略
//		}
		



	

}
