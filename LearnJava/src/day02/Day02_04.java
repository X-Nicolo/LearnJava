package day02;


//位运算符
public class Day02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<< :其实就是乘以2的移动的位数次幂。
//		>>:就是除以2的移动位数的次幂
//		总结：位运算！左乘右除！
		int x = 8>>3;
		System.out.println(x);
		
//		与、或、异或
		 int n = 6 & 3;
//		 110
//		&011
//		-----
//		 010 = 2
		 int m = 6 | 5;
//		 110
//		|101
//		----
//		 111 = 7;
		 System.out.println(n);
		 System.out.println(m);

	}

}
