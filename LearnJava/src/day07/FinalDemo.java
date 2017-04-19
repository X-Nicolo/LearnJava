package day07;
/*
 1、final:最终。作为一个修饰符，
 2、被final修饰的类不可以被继承
 3、被final修饰的类不可以被复写
 4、被final修饰的变量是一个常量只能赋值一次，即可以修饰成员变量，又可以修饰及局部变量
 在描述事物时，一些数据的出现值是固定的，那么这时为了增强阅读性，都给这值起个名字，方便于阅读，而这个值不需要改变，所以加个final修饰。作为常量：常量的书写规范所有字母都大写，如果由多个单词组成，单词间通过_连接。
 5. 内部类定义在类中的局部位置时，只能访问该局部被final修饰的局部变量。
 */

import org.omg.CORBA.PUBLIC_MEMBER;

final class Demo{
	void show(){
		final int Y = 4;//y终身为4
		final double MY_PI = 3.14;
//		final double MY_PI = 3.14;//静态 可共享
//		public final double MY_PI = 3.14;//权限足够大 通过类名即可访问
		
   
	}
	
//	final Void show(){
//		
//	}
}


public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
