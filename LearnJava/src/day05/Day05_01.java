package day05;
//面向对象
/*
面向对象（类与对象的关系）
人开门：名词提炼法。
人
{
	开门（门）
	{
		门.开（）
	}
}

门
{
	开（）{操作门轴等}
}
//面向对象三个特征：封装，继承，多态。
//以后开发：其实就是找对象使用。没有对象，就创建一个对象。
//找对象，建立对象，使用对象。维护对象的关系。

类和对象的关系：

现实生活中的对象：张三 李四。
想要描述：提取对象中共性内容。对具体的抽象。
描述时：这些对象的共性有：姓名，年龄，性别，学习java的能力。

映射到java中，描述就是class定义的类。
具体对象就是对应java在堆内存中用new建立的实体。

类就是：对现实生活中事物的描述。
对象：就是这类事物，实实在在存在的个体。
*/
//需求：描述汽车（颜色，轮胎数）.描述事物其实就是在描述事物的属性和行为。
//属性对应是类中变量，行为对应类中的函数（方法）。
//其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同成为类中的成员。



//类= 成员变量+方法
/*class Car 
{
	//描述颜色
	String color = "红色"；
	//描述轮胎数
	int num = 4;
	//运行行为
	void run
	{
		System.out.println(color+".."+num);
	}
}
//Demo
class CarDemo
{
	public static void main(String[] args)
	{
		System.out.println("----------[描述汽车]----------");
		//生产汽车，在java里通过new操作符来完成.
		//其实就是在堆内产生一个实体。
		Car c = new Car();//c就是一个类类型变量。记住:类类型变量指向对象。
		//需求：将已有车的颜色改成蓝色。指挥该对象做事情。在java中的指挥方式的方式:
		//			对象.对象成员
		c.color = "blue";
		c.run();
	}
	}
	
使用一个通用类来定义同一类型的关系。
类和对象之间的关系类似于苹果派配方和苹果派之间的关系。
java类使用变量定义数据域，使用方法定义动作。
类是一个定义相同类型对象的结构体。


举例：定义类和创建对象
//需求：定义一个Circle类并使用该类创建对象的程序。
程序构造三个圆对象，其半径分别为1.0，25，125.然后显示这三个圆的半径和面积。将第二个对象的半径改为100，然后显示它的新半径和面积。
class TestCircle1
{	//mian method
	public static void main(String[] args)
	{
		//creat a circle with radius 1.0，25，125
		Circle1 circle1 = new Circle1();
		System.out.println("The area of the circle of radius"+ circle1.radius + "is" + circle1.getArea());
		//creat a circle with radius 25
		Circle1 circle2 = new Circle1(25);
		System.out.println("The area of the circle of radius"+ circle2.radius + "is" + circle2.getArea());
		//creat a circle with radius 125
		Circle1 circle3 = new Circle1(125);
		System.out.println("The area of the circle of radius"+ circle3.radius + "is" + circle3.getArea());
		//Modify circle with radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius"+ circle2.radius + "is" + circle2.getArea());
	}
}	

//Define the circle class with two constructors
class Circle1
{
	//Construct a circle with radius 1
	Circle1()
	{
		radius = 1.0;
	}
	
	//Construct a circle with a specified radius
	Circle1(double newRadius)
	{
		radius = newRadius;
	}
	
	//Return the area of this circle
	double GetArea()
	{
		return radius*radius*Math.PI;
	}
}




2.成员变量和局部变量

成员变量和局部变量。
作用范围。
成员变量作用于整个类中。
局部变量作用于函数中，或者语句中。
在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在。
局部变量:存在栈内存中。

3.匿名对象的应用

//匿名对象

class CarDemo1
{
	public static void main(String[] args)
	{
		System.out.println("----------[匿名对象]----------");
		
		//Car c = new Car();
		//c.num = 5;
		//以上两句等价于
		//匿名对象
		new Car().num = 5;
		new Car().color = "blue";
		new Car().run();
		
		Car.c = new Car();
		c.run();
		c.num = 4;
		new Car().run();
		//匿名对象使用方式一：当对对象的方法只调用一次时，可以用匿名对象来完成，这样写比较简化。
		//如果对一个对象进行多个成员调用，必须给这个对象起个名字。
		//匿名对象使用的方式二：可以将匿名对象作为实际参数进行传递。
		
		//Car q = new Car();
		//show(q);//传递
		
		show(new Car());//传递简写
	}
	
	//函数////////////////////////////////////////////////////////////////////////
	//需求：汽车修配厂。对汽车进行改装，将来的车改成黑成，三个轮胎。
	public static void show (Car c)
	{
		c.num = 3;
		c.color = "balck";
		c.run();
	}

}	
	







*/

public class Day05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
