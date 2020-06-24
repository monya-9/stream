package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student ("Hong", 30), new Student ("Hwang", 25), new Student ("Park", 15));
		students.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("a".compareTo("b"));	//-1로 뜸 a가 앞에있고 b가 뒤에 있단 뜻 한칸 뒤에있다(?)
		System.out.println("Hong".compareTo("Hwang"));	//첫번째 열이 같으면 두번째 것으로 비교 두번째도 같으면 세번째 순으로 ~
		
		List<Person> persons = Arrays.asList(new Person ("Hong", 30), new Person ("Hwang", 25), new Person ("Park", 15));
		persons.stream().sorted(new Comparator<Person>() {	//위와 결과 같음

			@Override
			public int compare(Person o1, Person o2) {	
//				return o1.age - o2.age;	//나이 기준
				return o1.name.compareTo(o2.name);	//이름 순
				
			}
		}).forEach(System.out::println);
	}
}
