package day01;
//算数运算符
public class Day01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = 4270;
		x = x /1000 * 1000;
		System.out.println(x);//x为int型，故只有整数部分；
		System.out.println(1%5);//取余或取模.结果：1；
		System.out.println(-1%5);//若有负数，只看被模数。结果-1；
		System.out.println(1%-5);//结果1
		*/
		
		
		// ++  --
		int a = 3,b,c;
		b = a++;//后+1 ；
		//a++;-->a = a + 1;
		c = ++a;
		
		System.out.println(b);//结果：3；
		System.out.println(a);//结果：5；
		System.out.println(c);//结果：5；
		
		//字符串数据和任何数据使用+ 都是相连接，最终都会变成字符串；
		System.out.println(a+","+b);//结果：5,3；
		System.out.println("a="+a+",b="+b);//结果：a=5,b=3；  ""内的都保持不变 +是连接符；
		System.out.println("Hel" + "lo");//结果：Hello；
		System.out.println("ab" +5+5);//"5+5=55"；结果：ab55;


	}

}
