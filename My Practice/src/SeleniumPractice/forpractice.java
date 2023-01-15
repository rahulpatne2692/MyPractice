package SeleniumPractice;

import java.util.ArrayList;
import java.util.List;

public class forpractice {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	for (int i = 0; i < args.length; i++) {
		System.out.println(list.get(i));
	}
	
}
}
