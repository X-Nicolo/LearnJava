package day03;
//函数应用
public class Day03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需求2	
		//int sum = getSum(4,6);
		//System.out.println("sum="+sum);
		
		//需求3
		//boolean z = ifEqual(8,8);
		//System.out.println(z);
		
		//需求4
		//int c = getLarge(3,8);
		//System.out.println("The large one is "+c);
		
		//注意5
		//System.out.println(a+b);//错误，返回值类型void时不能直接输出 解决办法直接调用
		
		
		
		}
		
		
		
		/*
			如何定义一个函数呢？
			1，既然函数是一个独立的功能，那么该功能的运算结果是什么先明确
				因为这是在明确函数的返回值类型
			2，在明确在定义该功能的过程中是否需要未知的内容参与运算
				因为这是在明确函数的返回值类型
			*/
			//需求1：定义一个功能。完成3+4的运算。并将结果返回给调用者。
			/*
			1，明确功能的结果：是一个整数的和
			2，在实现该功能的过程中是否有未知内容参与运算，没有。
			其实在这两个功能就是在明确函数的定义。
			1，是在明确函数的返回值类型。
			2，明确函数的参数列表（参数的类型个参数的个数）
			
		public static int getSum()
		{
			return 3+4;
		}
		*/
		
		
		
		
		/*需求2
		以上函数的功能，结果是固定的，毫无拓展性而言。
		为了方便用户需求，由用户指定加数和被加数。这样，功能才有意义。
		思路；
		1，功能结果是一个和，返回值类型是int。
		2，有未知内容参与运算，有两个，这两个未知内容类型都是int.
		*/
		
		/*
		
		public static int getSum(int a,int b)
		{
			return  a+b;
		}
		*/
		//需求3：判断两个数是否相同。
		/*
		1,明确功能的结果：结果是：boolean
		2,功能是否有未知内容参与运算。有，两个整数。
		*/
		/*
		public static boolean ifEqual(int x,int y)
		{
			if(x==y)
				return true;
			return false;
			//三元运算符
			//return(a==b)?true:false;
			
			//return a==b;//针对返回真假值得最简式
		}
		*/
		
		
		
		
		/*
		需求4：定义一个功能，对两个数进行比较，获取较大的数。
		
		public static int getLarge(int a,int b)
		{
			if(a>b)
				return a;
			return b;
			//return (a>b)?a:b; //方法2
		}
		
		*/
		
		//注意5
		/*这个功能定义思想有问题，为什么呢？因为只为完成加法运算。
		至于是否要对和进行打印操作，那是调用者的事情，不要再该功能中完成。
		public static void get(int a,int b)
		{
			System.out.println(a+b);//最好不要这样做
			return;
		}
		*/


	}

