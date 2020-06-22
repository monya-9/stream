package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student {
	private String name;
	private int score;
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() { return this.name;}
	public int getScore() {return this.score;}
}

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 35), new Student("Hwang", 55), new Student("Park", 60));
		
//		Stream<Student> stream =  students.stream();
		Predicate<Student> predicate = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getScore() > 50;
			}
			
		};
		students.stream().filter(t -> t.getScore()  > 50).forEach((t) -> System.out.println(t.getName() + ", " + t.getScore())
		);
	}
}
