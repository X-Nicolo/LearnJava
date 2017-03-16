package day03;
//语句练习
public class Day03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		练习
		----*
		---* *
		--* * *
		-* * * *
		* * * * *

		分析：打印等腰三角形
		-：代表空格
		**之间有空格
		简化问题：
		----*
		---**
		--***
		-****
		*****
		即两个三角形
		*/
		for(int x=1;x<=5;x++)//行控制
		{
			for(int y=5;y>x;y--)//列控制“-”控制
			{
				System.out.print("-");
			}
			for(int z=1;z<=x;z++)//"* "控制
			{
				System.out.print("* ");
			}
			System.out.println();
		}




	}

}
