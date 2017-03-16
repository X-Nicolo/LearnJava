package day04;
//选择排序
/*
数组：排序-选择排序
需求：对给定数组进行排序{5,1,6,4,2,8,9}
*/

public class Day04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,1,6,4,2,8,9};
		printArray(arr);//排序前
		selectSort(arr);//排序
		printArray(arr);//打印


	}
	//函数////////////////////////////////////////////////////////////////////////
	//排序
	public static void selectSort(int arr[])
	{	
		
		for(int x=0;x<arr.length-1;x++)//比较基准
		{
			for(int y=x+1;y<arr.length;y++)//依次比较
			{
				if(arr[x]>arr[y])
				{
					int temp = 0;
					temp = arr[x];
				    arr[x] = arr[y];
					arr[y] = temp;
				}
					
			}		
		}
	}
	//打印数组
	public static void printArray(int arr [])
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]+"]");
		System.out.println();//换行
	}


}
