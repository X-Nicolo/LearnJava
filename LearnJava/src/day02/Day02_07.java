package day02;
//if语句
public class Day02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if的三种格式：
//		1、
//		if (条件表达式) {
//			执行语句
//			
//		}
//		2、
//		if () {
//			
//		} else {
//
//		}
//		3、
//		if () {
//			
//		}
//		else if(){
//			
//		}
//		else {
//			
//		}
		 /*
		//需求1：根据用户定义的数值不同，打印对应的星期英文
		
		int mum = 2;
		if(num == 1)
			System.out.println("Mon");
		else if(num == 2)
			System.out.println("Tue");
		//。。。。。。
		else
			System.out.println("Error");
		*/
		
		//需求2：根据用户指定月份，打印该月份所属的季节
		//3 4 5 春季；6 7 8 夏季；9 10 11 秋季；12 1 2 冬季
		int x = 14;
		
		if(x==3 || x==4 || x==5)//| 与|| 区别；|：两边都参与运算；||：当左边为真时，右边不运算。
			System.out.println(x+"月属于春季");
		else if(x==6 || x==7 || x==8)
			System.out.println(x+"月属于夏季");
		else if(x==9 || x==10 || x==11)
			System.out.println(x+"月属于秋季");
		else if(x==12 || x==1 || x==2)
			System.out.println(x+"月属于冬季");
		else
			System.out.println("你TM在逗我?");

	}

}
