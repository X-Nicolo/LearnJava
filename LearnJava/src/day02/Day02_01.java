package day02;
//转义字符
public class Day02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");//ln 标识换行
		System.out.println("Hello Java");//
		
		/*
		 转义字符：通过\来转变后面字母或者符号的含义，
		 \n:换行
		 */
		//转义字符
		System.out.print("Hello \n World");
		
		//转义字符
		/*
		\n:换行；
		\b：退格，相当于backspace；
		\r:按下回车键windows系统中是由两人字符来表示\n \r;
		\t:制表符，相当于tab键。
		System.out.print("Hello \n World");
		*/
		System.out.println("\"Hello\"");//对其进行转义，转义字符写在被转义字符的前面



	}

}
