package day07;
/*抽象类Test
 
 假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：
 姓名、工号以及工资。经理也是员工，除了含有员工的属性外，
 另外还有一个奖金属性。请使用继承的思想设计出员工类和经理类，
 要求类中提供必要的方法进行属性访问。
 
 员工类：name id pay
 经理类：继承了员工类，并有自特有的bonus。
 
 */


abstract class Employee{//普通员工
	private String name;
	private String id;
	private double pay;
	
	Employee(String name,String id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
		// TODO Auto-generated constructor stub
	}
	public abstract void work();

	
}

class Pro extends Employee{
	Pro(String name,String id,double pay){
		super(name, id, pay);
	}
	public void work(){
		System.out.println("Pro work");
	}
}

class Manager extends Employee{//经理
	private int bonus;
	Manager(String name,String id,double pay,int bonus) {
		
		super(name,id,pay);
		this.bonus = bonus;
		}
	public  void work(){
		System.out.println("manager work");
	}
	
}
	
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
