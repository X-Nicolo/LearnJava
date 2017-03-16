package day04;
//折半查找
/*
 * */
public class Day04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_0[] = {3,2,1,5,4,2,9};
		System.out.println("----------[遍历查找]----------");
		int index_0 = getIndex(arr_0,2);
		System.out.println("index_0="+index_0);
		System.out.println("----------[折半查找]----------");
		int arr[]={2,4,5,7,19,32,45};
		int index_1 = halfSearch(arr,32);
		System.out.println("index_1="+index_1);
		System.out.println("----------[折半的第二种方式]----------");
		int index_2 = halfSearch_2(arr,19);
		System.out.println("index_2="+index_2);
		System.out.println("----------[插入数值]----------");
		int index_3 = getIndex_2(arr,8);
		System.out.println("index_3="+index_3);
		System.out.println("----------[ex5]----------");
		
		System.out.println("Hello World!");


	}
	
	//函数////////////////////////////////////////////////////////////////////////
	//遍历查找
	//定义功能，获取key第一次出现的位置，返回是-1表示不存在
	public static int getIndex(int arr[],int key)
	{
		for(int x=0;x<arr.length;x++)//遍历数组
		{
			if(arr[x]==key)//中标
				return x;
		}
		return -1;//角标没有负数，表示错误
	}
	/*折半查找，提高效率，但是必须要保证该数组是有序的数组*/
	public static int halfSearch(int arr[],int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length;
		mid = (min+max)/2;
		
		while(arr[mid]!=key)
		{
			if(key>arr[mid])//key大于中间值 往大的那边走
				min = mid +1;//小角标增
			else if (key<arr[mid])
				max = mid -1;//大角标减
			
			if(min>max)
				return -1;
			mid = (min+max)/2;
		}
		return mid;
		
	}
	//折半的第二种方式 
	//只有min和max之间有距离 就可以折半
	public static int halfSearch_2(int arr[],int key)
	{
		int min = 0,max = arr.length-1,mid;
		
		while(min<=max)
		{
			mid = (max+min)>>1;//除以2
			
			if(key>arr[mid])
				min = mid + 1;
			else if (key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}
	//在有序数组中插入数值
	public static int getIndex_2(int arr[],int key)
	{
		int min = 0,max = arr.length-1,mid;
		
		while(min<=max)
		{
			mid = (max+min)>>1;//除以2
			
			if(key>arr[mid])
				min = mid + 1;
			else if (key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min;//要插入的位置
	}


}
