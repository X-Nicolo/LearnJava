package day02;
//switch语句
public class Day02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		格式：
//		switch (表达式) {
//		case 取值1:
//			执行语句
//			break;
//		case 取值2:
//			执行语句
//			break;
//		case 取值3:
//			执行语句
//			break;
//
//		default:
//			break;
//		}
//		特点：switch 语句选择的类型只有四种：byte,short,int,char.
//		case和default之间没有顺序，先执行第一个case，没有匹配的case执行default.
		
		int x = 2;
		switch(x)
		{
			case 4:
				System.out.println("a");
				break;
			case 6:
				System.out.println("b");
				break;
			case 2:
				System.out.println("c");
				break;
			default:
				System.out.println("d");
				break;
		}

	}

}
