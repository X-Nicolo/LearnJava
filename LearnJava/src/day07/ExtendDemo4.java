package day07;

/**子父类中的构造函数
 * 子父类中的构造函数：
在对子类对象进行初始化 时，弗父类的构造函数也会运行，那是因为子类的构造函数第一行默认有一条隐式语句super()；
super()：会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super()

为什么子类一定要访问父类中的构造函数？
因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类如何对这些数据进行初始化的，所以子类在对象进行初始化时，要先访问一下父类中的构造函数
如果要访问父类中指定的构造函数，可以用super语句来指定。

* 子类的实例化过程：

结论：子类所有的构造函数默认都会访问父类中空参数的构造函数，因为子类每一个构造函数的第一行都有一句隐式的super()
当父类中没有空的构造函数时，子类必须手动通过super或者this语句形式来指定要访问父类中的构造函数。
当然：子类中的构造函数第一行也可以手动指定this语句来访问本类中的构造函数，子类中至少会有一个构造函数会访问父类中的构造函数
*/


class Fu2{
	Fu2(){
		System.out.println("fu run");
	}
}

class Zi2 extends Fu2{
	Zi2(){
		//super)();默认从父类继承过来
		System.out.println("Zi run");
	}
	Zi2(int x){
		System.out.println("zi..."+x);
	}
}


public class ExtendDemo4 {

	public static void main(String[] args) {
		Zi2 zi = new Zi2();
		Zi2 z1 = new Zi2(4);
		

	}

}
