package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		
//		employees.stream().map((t -> t.getName()))	//H들어가는 이름만 가져오기
//				.filter(t -> t.startsWith("H"))
//				.forEach(s -> System.out.println(s));
		
		employees.stream().map((t) -> t.getName()	//람다 후
		).flatMap(t -> IntStream.range(0, t.length()).mapToObj(value -> t.charAt(value)))
		
//		employees.stream().map(new Function<Employee, String>() {	//람다 전
//
//			@Override
//			public String apply(Employee t) {	//Employee class에 있는 이름을 가져옴
//				return t.getName();
//			}
//		}).flatMap(new Function<String, Stream<Character>>() {
//
//			@Override
//			public Stream<Character> apply(String t) {	//각각의 문자열을 가져와서
//				return IntStream.range(0, t.length()).mapToObj(new IntFunction<Character>() {	//IntStream의 range로 intStream을 만듦, 읽어온 값들을 Character 타입으로 바꿈
//																								//한글자식 밑으로 쭉 나옴 ln지우면 옆으로
//					@Override
//					public Character apply(int value) {
//						return t.charAt(value);
//					}
//				});
//			}
//		})
		.forEach(s -> System.out.println(s));
	}
	
}
