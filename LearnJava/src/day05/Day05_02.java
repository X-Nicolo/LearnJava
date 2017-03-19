package day05;
//面向对象  私有、封装

/*封装private

private:私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）
注意：私有只在本类中有效。

将age私有化以后，类以外即使建立了对象也不能直接访问。
但是人应该有年龄，就需要在Person类中提供访问age的方式。

!!!访问变量的两种方式：1，设置变量；2，获取变量。
注意：私有仅仅是封装的一种表现形式。
！！！之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句。
对访问的数据进行操作，提高代码健壮性。

封装原则：1，将不需要对外提供的内容都隐藏起来；
		  2，把属性都隐藏，提高公共方法对其访问。
*/
class Person
{
	private int age;
	
	//设置变量；
	public void setAge(int a )//set
	{
		if(a>0 && a<130)
		{
			age = a;
			speak();
		}
		else
			System.out.println("feifa age");
	}
	
	//获取变量。
	public int getAge()//get
	{
		return age;
	}
	void speak()
	{
		System.out.println("age="+age);
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//p.age = 20;//私有了 不可以直接访问
		p.setAge(-20);
		//p.speak();
	}
	
	//函数////////////////////////////////////////////////////////////////////////
	

}