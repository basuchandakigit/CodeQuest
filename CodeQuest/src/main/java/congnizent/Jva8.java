package congnizent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Jva8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("John", "Jane", "ack", "Doe");
		List<String> filteredNames = names.stream()
		                                  .filter(s -> s.startsWith("J"))
		                                  .collect(Collectors.toList());
		List<String> f1 = names.stream().filter(a->a.endsWith("e")).collect(Collectors.toList());
		System.out.println(filteredNames);
		System.out.println(f1);
		
	}

}
