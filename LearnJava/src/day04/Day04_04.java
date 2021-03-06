package day04;
//数组获取最值

/*
数组——获取最值
给定一个数组{5,1,6,4,2,8,9}
1,获取数组中的最大值，以及最小值

思路：
1，获取最值需要进行比较。每一次比较都会有一个较大的值。因为该值不确定。
通过一个变量进行存储，变量的初始值为数组中的任何一个数即可。
2，让数组中的每一个元素都和这个变量中的值进行比较。
如果大于了变量中的值，就用该变量记录较大值。
3，当所有的元素都比较完成，那么该变量中存储的就是数组中的最大值。

步骤：
1.定义变量，初始化为数组中任意一个元素即可。
2.通过循环语句对数组进行遍历。
3.在变量过程中定义判断条件，如果遍历到的元素比变量中的元素大，就赋值给该变量；

需要定义一个功能来完成，以提高复用性。
1，明确结果，数组中的最大元素 int
2，未知内容：一个数组。int[]
*/

public class Day04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------[ex1]----------");
		int arr[] = {5,1,6,4,2,8,9};
		int max1 = getMax1(arr);
		System.out.println("最大值："+max1);
		System.out.println("----------[ex2]----------");
		int max2 = getMax2(arr);
		System.out.println("最大值："+max2);
		System.out.println("----------[ex3]----------");
		int max3 = getMax3(arr);
		System.out.println("最大值："+max3);
		System.out.println("----------[ex4]----------");
		int min = getMin(arr);
		System.out.println("最小值："+min);
		System.out.println("----------[ex5]----------");
		
		System.out.println("Hello World!");

		

	}
	
	//函数////////////////////////////////////////////////////////////////////////
	//myself
	public static int getMax1(int arr[])
	{
		int temp = arr[0];//初始化 为数组中任意一个数即可
		for(int x=0;x<arr.length-1;x++)
		{
			if(arr[x]>arr[x+1])
				temp = arr[x];
			else
				temp = arr[x+1];
		}
		return temp;
	}
	
	//teacher
	public static int getMax2(int arr[])
	{
		int max = arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
	}
	//获取最大值的另一种方式
	//可不可以将临时变量初始化为0呢？可以将0作为角标。这种方式其实是在初始化数组中任意一个角标。
	public static int getMax3(int arr[])
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return arr[max];
	}
	
	//获取最小值
	public static int getMin(int arr[])
	{
		int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}
	//获取double型数组的最大值，因为功能一致所以定义相同函数名称
	// 以重载的形式存在
	/*
	public static double getMax(int arr[])
	*/


}
