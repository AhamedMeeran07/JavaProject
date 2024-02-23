package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Random obj=new Random();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			int number = obj.nextInt(5);
			list.add(number);
		}
		System.out.println("List elements are: "+list);
		
		Set<Integer> set= new HashSet<>(list); //it will delete the duplicate in the list 
		
		System.out.println("Set element are: "+set);
	}

}
