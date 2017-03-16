package day03;
//break,continue
public class Day03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		break:跳出语句，应用于选择结构和循环结构
//		continue：继续语句，应用于循环结构
		/*
		w:for(int x=0;x<3;x++)
		{
			System.out.println("x="+x);
			break;
		}
	    System.out.println("——————————————————");
		q:for(int y=0;y<4;y++);
		{
			for(int z=0;z<3;z++)
		{
			System.out.println("z="+z);
			//break;//只是跳出当前循环
			//若想要跳出任意循环，用到标号
			break w;
		}
		}
		*/
		
		//continue:只能作用于循环结构。
		//特点：结束本次循环，继续下一次循环继续循环。
		for(int x=0;x<10;x++)
		{
			if(x%2==1)
				continue;//if满足后 直接继续下一次循环 X++
			System.out.println("x="+x);
		}
		/*
		w:for(int x=0;x<3;x++)
		{
			System.out.println("x="+x);
			break;
		}
	    System.out.println("——————————————————");
		q:for(int y=0;y<4;y++);
		{
			for(int z=0;z<3;z++)
		{
			System.out.println("z="+z);
			//break;//只是跳出当前循环
			//若想要跳出任意循环，用到标号
			continue w;//直接继续x++;
		}
		}
		记住：
		1，break和continue语句作用的范围
		2，break和continue单独存在时，下面可以有任何语句。因为都执行不到。
		
		*/

	}

}
