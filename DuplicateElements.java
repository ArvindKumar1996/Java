package demoPack;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[]= {"Java","JavaScript","Ruby","Python","C","Java"};
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}

	}

}
