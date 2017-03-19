package day05;
//This
/*
 this:看上去，是用于区分局部变量和成员变量同名的情况。
 Preson(String name){
 this.name = name;
 }
 
 this:就代表本类的对象，到底代表哪一个呢？
 	this代表其所在函数所属对象的引用。
 	this.name 相当于p1.name
 	Person(String name){
 	this.name = name;
 	}
 	
 	Person(String name.int age){
 	this.name = name;
 	this.age = age;
 	}
 	 public void speak(){
		System.our.println("name="+this.name+"...age="+this.age);
		this.show();
 	 
 	 }
 	 
 	 
this的应用：
当定义类中功能时，该函数内部都有用到调用该函数的对象时，这时用this表示这个对象。
但凡本类功能内部使用了本类的对象，都用this表示。

 */
/*
this 语句：用于构造函数之间进行互相调用。
this语句只能定义在构造函数的第一行，因为初始化要先执行。
*/


//class Person
//{
//	private String name;
//	private int age;
//	
//	Person()
//	{
//		//this("haha")
//	}
//	Person(String name)
//	{
//		this.name = name;
//	}
//	Person(String name,int age)
//	{
//		//this.name = name;
//		this(name);//相当于p(name);
//		this.age = age;
//	}
//}

public class Day05_04 {

	public static void main(String[] args) {
		
//		Person p = new Person ("lisi",30);
		System.out.println("test");



	}

}
