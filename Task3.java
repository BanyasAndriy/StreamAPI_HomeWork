package HomeWork11.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		
		List<Integer> list = new ArrayList<>();
		
		int[] rez = str.chars().toArray();
		for (int result : rez) {
			System.out.println(result);
		}
	
		
		
	
	
	}

}
