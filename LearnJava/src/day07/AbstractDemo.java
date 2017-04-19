package day07;
/*
 抽象类
当多个类中出现相同功能，但是功能的主体不同，这时可以向上抽取，这时只能抽取功能定义，而不抽取功能主题
抽象：看不懂
抽象类的特点：

1. 抽象方法一定在抽象类中。
2. 抽象方法和抽象类都必须被abstract关键字修饰。
3. 抽象类不可以用new创建对象，因为调用抽象方法没意义。
4. 抽象类中的方法要被使用，必须由子类复写起所有的抽象方法之后，建立子类对象调用。如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。

抽象类和一般类没有太大的不同。
该如何描述事物，就如何描述事物，只不过，该事物出现了一些看不懂的东西。
这些不确定的部分，也是该事物的功能，需要明确出现。但是无法定义主体。


抽象类比一般类多了个抽象函数。就是在类中可以定义抽象方法。  
抽象类不可以实例化。  
特殊：抽象类中可以不定义抽象方法，这样做仅仅是为了不让该类建立对象。
 */
abstract class Student2{//抽象方法必须放在抽象类里面
	abstract void study();
	
}
class BaseStudent extends Student2{
	void study(){
		System.out.println("base study");
		
	}
	
}

class AdvStudent extends Student2{
	void study(){
		System.out.println(" advstudy");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		new BaseStudent().study();

	}

}
