package HomeWork11.Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {

	public static void main(String[] args) {
		
		
		List<String> students = new ArrayList<>(Arrays.asList("Стеценко Ярослав","Баняс Андрій","Чернієнко Ярослав","Бачинський Євгеній"));
		
		List<String> filteredStudents = new Task1().searchStudentsFirstCharacter(students,'С');
	
		System.out.println(filteredStudents);
	
		

	}
	
	public List<String> searchStudentsFirstCharacter(List<String> stud , char ch) {
		
		List<String> filteredStud = stud.stream()
		.filter(lastName->lastName.charAt(0)==ch)
		.collect(Collectors.toCollection(ArrayList::new));
		return filteredStud;
	
		
	}

}
