package day07;


/**
 
07-01&02 继承概述
将学生和工人的共性描述提取出来，单独进行描述，
只要让学生和工人与单独描述的这个类有关系，就可以了。
 
 *
 *继承:
 *1、提高了代码的复用性
 *2、让类与类之间产生了关系，有了关系，才有了多态
 *
 *注意:千万不要为了获取其他类的功能，简化代码而继承。
 *必须是类与类之间有所属关系才可以继承，所属关系 is a。

**java语言中：java只支持单继承，不支持多继承。**

  因为多继承容易带来安全隐患：当多个父类中定义了相同的功能，当功能内容不同时，子类对象不确定要运行哪一个。
  但是java保留了这种机制，并用另一种体现形式来完成表示，多实现。

* **java支持多层继承。**
* 
* * **如何使用一个继承体系中的功能？**

想要使用体系，先查阅体系父类的描述，因为父类中定义的是该体系的共性功能。

通过了解共性功能，就可以知道该体系的基本功能。那么这个体系已经可以基本使用了
那么在具体调用时，要创建最子类的对象。
因为：1.可能父类不能创建对象 2.创建子类可以使用更多的功能，包括基本的也包括特有的
简单的说，就是查阅父类，创建子类
 *。/





/*共性
 * 
 * 父类*/

class  Person{
	String name;
	int age;
}


/*学生
 * 子类*/
class Student extends Person{
//	String name;
//	int age;
	void study(){
		System.out.println("Good study");
	}
}

/*工人
 * 子类*/
class Worker extends Person{
//	String name;
//	int age;
	void work(){
		System.out.println("Good work");
	}
}
public class ExtendDemo {

}
