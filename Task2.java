package HomeWork11.Stream_API;

import java.util.*;
import java.util.stream.IntStream;

public class Task2 {

	public static void main(String[] args) {
	
		List<Integer> num = new ArrayList<>(Arrays.asList(-2,-1,0,10,1,4,2,3,4,5,6,7,8,9));
		
		System.out.println(new Task2().findNum(num));
		

	}
	
	
	public int findNum(List<Integer> nums) {
		int result;
		
			result = nums.stream()
			.filter(x->x!=0)		
			.map(x-> Math.abs(x))
			.min((a,b)->a-b).get();
			
			
			return result;
			
		
	}

}
