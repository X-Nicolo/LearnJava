package day03;
/*函数的重载
 重载的概念：在同一个类中，允许存在一个以上的同名函数，只要它们的参数个数或者参数类型不同即可
 重载的特定：与返回值类型无关，只看参数列表
 重载的好处：方便阅读，优化了程序设计。*/
public class Day03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*函数的重载（overload）
		在同一个类中，允许存在一个以上的同名函数，只要它们的参数个数或者参数类型不同即可
		什么时候用重载？
		当定义的功能相同，但是参与运算的未知内容不同。
		那么，这时就定义一个函数名称以表示其功能，方便阅读，而通过参数列表的不同来区分多个同名函数。
		*/
		int sum1 = add(3,4);
		int sum2 = add(7,8,9);
		System.out.println("sum1="+sum1+"  sum2="+sum2);
		
		print99();//调用函数：打印99乘法表
		          //无返回值 只可调用
				  
		print99(4);//调用函数：print99()重载
		           //无返回值 只可调用	  
		System.out.println("Hello World!");

	}
	//函数：定义一个加法运算，获取两个整数的和
	public static int add(int x,int y)
	{
		return x+y;
	}
	
	
	//函数：定义一个加法，获取三个整数的和
	public static int add(int x,int y,int z)
	{
		return x+y+z;
		//return add(x,y)+z;调用函数
	}
	
	//函数：打印99乘法表
	public static void print99()//无返回值 只可调用
	{
		for(int x=1;x<=9;x++)//行循环
		{
			for(int y=1;y<=x;y++)//列循环
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");//"\t"为制表符 结果中对齐
				System.out.print(" ");//输出空格，print不能输出为空
			}
			System.out.println();//换行，println可以为空
		}
		System.out.println("Game Over!");
		
		//print99(9);//调用函数
	}
	
	//print99()重载
	public static void print99(int num)//无返回值 只可调用
	{
		for(int x=1;x<=num;x++)//行循环
		{
			for(int y=1;y<=x;y++)//列循环
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");//"\t"为制表符 结果中对齐
				System.out.print(" ");//输出空格，print不能输出为空
			}
			System.out.println();//换行，println可以为空
		}
		System.out.println("Game Over!");
	}


}
