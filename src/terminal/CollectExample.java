package terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Abby", "Charlie", "Choi");
		
		List<String> filterList = strList.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("C");
			}
		}).collect(Collectors.toList());
		filterList.stream().forEach(s -> System.out.println(s));
		
		List<Student> students = Arrays.asList(new Student("Hong", 34, Student.Sex.MALE), new Student("Hwang", 22, Student.Sex.FEMALE),
												new Student("Park", 33, Student.Sex.MALE), new Student("Choi", 44, Student.Sex.FEMALE));
		List<Student> maleStudent = students.stream().filter(s -> s.getSex() == Student.Sex.MALE).collect(Collectors.toList());
		long cnt = maleStudent.stream().peek(s -> System.out.println(s.getName())).count();
		System.out.println("총" + cnt + "명");
		
		HashSet<Student> femaleSet = students.stream().filter(s -> s.getSex() == Student.Sex.FEMALE).peek(s -> System.out.println(s.getName()))
		 	.collect(Collectors.toCollection(new Supplier<HashSet>() {

			@Override
			public HashSet get() {
				return new HashSet<String>();
			}
		}));
		int result = femaleSet.stream().map(new Function<Student, Integer>() {

			@Override
			public Integer apply(Student t) {
				return t.getScore();
			}
		}).reduce(0, accumulator); 	//집계
		System.out.println("합은: " + result);
	}
}
