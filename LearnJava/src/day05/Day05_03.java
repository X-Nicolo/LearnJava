package day05;

//面向对象（构造函数）
/*
  特点：
	 1、函数名与类名相同
	 2、不用定意思返回值类型
	 3、不可以写return语句
 作用：
 	给对象进行初始化
 注意：
 	1、默认构造函数的特点。
 	2、多个构造函数是以重载的形式存在的。
 	
 	
 	面向对象 构造函数 初始化

对象一建立就会调用与之对应的构造函数。
构造函数的作用：可以用于给对象进行初始化。

构造函数的小细节：
当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数。

当在类中自定义了构造函数后，默认的构造函数就没有了。

构造函数和一般函数在写法上有不同，

在运行上也有不同。
//构造函数是在对象一建立就运行，给对象初始化。
而一般方法是对象调用才执行，是给对象添加对象具备的功能。

//一个对象建立，构造函数只运行一次。
而一般方法可以被该对象调用多次。

什么时候定义构造函数呢？
当分析事物时，该事物在具备一些特性或者行为，那么将这些内容定义在构造函数中。

 	


//class Person//定义person类
{
	private String name;//私有
	private int age;
	
	//构造函数
	Person()
	{
		System.out.println("A:name="+name+",age="+age);
		cry();
	}
	
	//一个类里也可以写多个函数
	//当然也可以重载
	Person(String n)
	{
		name = n;
		System.out.println("B:name="+name+",age="+age);
		cry();
	}
	
	Person(String n,int a)
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+",age="+age);
		cry();
	}
	
	public void cry()//初始化 构造函数
	{
		System.out.println("cry");
	}
	//set get
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
}*/
public class Day05_03
{
	public static void main(String[] args)
	{
//		Person p1 = new Person();
//		p1.cry();//初始化后继续该动作
//		
//		Person p2 = new Person("lisi");
//		
//		p2.setName("libushi");
//		System.out.println(p2.getName());
//		
//		
//		Person p3 = new Person("wangwu",10);
		System.out.println("FALSE");
	}
	
	//函数////////////////////////////////////////////////////////////////////////
	
}	

 



	