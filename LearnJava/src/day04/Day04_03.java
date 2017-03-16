package day04;
//数组遍历
public class Day04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的操作
		//获取数组中的元素,通常会用到遍历
		/*
		int[] arr = new int[3];
		for(int x=0;x<3;x++)
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}
		*/
		/*结果：
		arr[0]=0;arr[1]=0;arr[2]=0;//初始化为0
		System.out.println("----------------------------");
		*/
		System.out.println("----------[ex1]----------");
		//若改为：
		int[] arr = {3,6,5,1,8,9};//可打印出所有元素
		for(int x=0;x<6;x++)
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}
	    System.out.println("----------[ex2]----------");
		//数组中有一个属性可以直接获取到数组元素的个数：length.
		//使用方式：数组名称.length = 
		System.out.println("arr_length:"+arr.length);//打印arr数组的长度
		System.out.println("----------[ex3]----------");
		//数组求和
		int sum = 0;
		for(int x=0;x<arr.length;x++)
		{
			sum += arr[x];
		}
		System.out.println("sum="+sum);
		System.out.println("----------[ex4]----------");
		//调用函数，打印各元素int[] arr = {3,6,5,1,8,9};
		//System.out.println(arr);//结果：输出的数组的地址[I@15db9742 数组实体的引用，[I数组int型，后面的为值
		printArray(arr);
		System.out.println("Over!");


	}
	
	
	
	//函数：定义一个功能，用于打印数组中的元素，元素间用逗号隔开
	public static void printArray(int [] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print("arr["+x+"]="+arr[x]+",");
			else
				System.out.print("arr["+x+"]="+arr[x]);
		}
	}


}
