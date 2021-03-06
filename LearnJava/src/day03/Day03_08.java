package day03;
/*函数练习
1，定义一个功能，用于打印矩形
2，定义一个打印99乘法表功能的函数
*/


public class Day03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRectangle(4,5);
		multiTable(9,9);


	}
	//打印矩形
	/*思路
	1，确定结果：没有，因为直接打印。所以返回值类型是void
	2，有未知内容吗？有，两个，因为矩形的行和列不确定
	*/
	public static void getRectangle(int a,int b)
	{
		for(int x=0;x<a;x++)
		{
			for(int y=0;y<b;y++)
			{
				System.out.print("*");//不换行
			}
			System.out.println("");//换行
		}
	}
	
	
	//九九乘法表
	public static void multiTable(int m,int n)
	{
		for(int x=1;x<=m;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");//\t制表符
			}
			System.out.println(" ");
		}
	}


}
