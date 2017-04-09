package day06;

public class Day06_04 {

	public static void main(String[] args) {
		
		int [] arr ={3,4,1,8};
		int max = 0;
		for(int x = 1;x < arr.length;x++){
			
			if (arr[x]>arr[max]) {
				max = x;
				
			}
			
		}
		System.out.println("max="+arr[max]);
		

	}

}
