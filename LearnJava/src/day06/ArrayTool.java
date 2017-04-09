package day06;
/*虽然也可以建立对象使用工具中的方法，发现了问题： 1.对象时用来封装数据的，可是工具箱中的对象并未封装特有的数据。
操作数组的每一个方法都没用到工具箱对象中特有的数据。 这时候考虑让程序更严谨，是不需要对象的。 因此：可以将工具箱中的方法都定义成static的，可以直接通过类名调用。
将方法将都静态后，可以方便于使用，但是该类还是可以被建立对象 为了更加严谨，可以将对象私有化。*/
public class ArrayTool {
	/**
	空参数构造函数*/
	private ArrayTool(){}
	/**
	 获取一个整形数组中的最大值
	 @param arr 接收一个int类型的数组
	 @return 会返回一个该数组中的最大值
	*/
	public static int getMax(int[] arr){
		int max=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	/**
	 获取一个整形数组中的最小值
	 @param arr 接收一个int类型的数组
	 @return 会返回一个该数组中的最小值
	 */
	public static int getMin(int[] arr){
		int min=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
	/**
	给数组进行选择排序
	 @param arr 接收一个int类型的数组
	*/
	public void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for (int y=x+1;y<arr.length;y++){
				if (arr[x]>arr[y]){
					swap(arr, x, y);
				}
			}
		}
	}
	/**
	 给数组进行冒泡排序
	 @param arr 接收一个int类型的数组
	 */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<=arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){swap(arr, y, y+1);}
			}
		}
	}
	/**
	 *给数组进行位置置换
	 *@param arr 接收一个int类型的数组
	 *@param  a 要置换的位置
	 *@param  b 要置换的位置
	 * */
	private static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 用于打印数组中的元素，打印形式是：[e1,e2...]
	 * */
	private void printArray(int[] arr){
		System.out.print("[");
		for (int x=0;x<arr.length;x++){
			if(x!=arr.length-1)
			System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
			
		}
	}

};

/*
 * 一个类中默认会有一个空参数的构造函数
 * 这个默认的构造函数的权限和所属的类一致
 * 如果这个类没有public修饰，那么默认的构造函数，那么构造函数也没有public修饰*/
 