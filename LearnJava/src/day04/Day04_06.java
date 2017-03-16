package day04;
//数组（冒泡排序）
/*
 冒泡排序：相邻的两个元素进行比较，如果符合条件换位
 第一圈：最值出现了最后位
 最小的往前排 最值往后移
效率最高的排序：希尔排序*/

public class Day04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,1,6,4,2,8,9};

		
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)//-x:让每一次比较的元素减少；-1：避免角标越界
			{
				if(arr[y]>arr[y+1])
				{
					int temp = arr[y];
					arr[y] = arr [y+1];
					arr[y+1] = temp;
				}
			}
		}
		printArray(arr);//打印


		

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
