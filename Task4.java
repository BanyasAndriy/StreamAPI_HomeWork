package HomeWork11.Stream_API;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;


public class Task4 {

	public static void main(String[] args) throws IOException {
		
		File newFile = new File("Task4.txt");
	
		Path path = newFile.toPath();
		
		
		
List<Integer> res = new ArrayList<>();

		Files.lines(path)
			.map((x)->{
			
				List<Integer>	list = new ArrayList<>();		
			String[] str = x.split(" ");
		    for (int i = 0 ; i < str.length;i++) {
				list.add(Integer.parseInt(str[i]));
		    } 
		 
				return list.stream().max((a,b)->a-b);
			
		 
			
		    
			}).forEach(x->System.out.println("Max = " + x.get()));

	
	
			
				 
	
	
		
	}

}
