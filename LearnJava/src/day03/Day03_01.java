package day03;
//while语句
public class Day03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		格式：
//		while (语句表达式) {
//			执行语句
//			
//		}
		
		
		/*
		定义初始化表达式；
		while（条件表达式）
		{
			循环体（执行语句）；
		}
		*/
		/*
		定义初始化表达式；
		while（条件表达式）
		{
			循环体（执行语句）；
		}
		*/
		int x = 1;
		while(x<3)
		{
			System.out.println("Hello world!");
			x++;
		}
		System.out.println("Over!");
		
//		练习：
		//从1打印到10
		int y = 1;
		while(y<=10)
		{
			System.out.println("y="+y);
			y++;
		}
		System.out.println("Game Over!");
		
		//打印出1到10的所有奇数
		
		int a = 1;
		while(a<=10)
		{
			System.out.println("a="+a);
			a+=2;
		}
		System.out.println("Game Over!");
		
		//while和do while 
		/*
		while：先判断条件，只有条件满足才执行循环体
		do while：先执行循环体，再判断条件，条件满足，再继续执行循环体。
		简单一句话：do while：无论条件是否满足，循环体至少执行一次

	*/



		
		

	}

}
