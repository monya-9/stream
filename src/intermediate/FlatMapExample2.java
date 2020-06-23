package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.flatMap(t -> Stream.of(t * 2)).filter(t -> t > 3).forEach(s -> System.out.println(s));	//t에 2를 곱한 값 중에서 3이상인 값만 출력
		
		stream = Stream.of(1, 2, 3);	//stream 재입력 하기
		int sum = stream.flatMapToInt(t -> IntStream.of(t * 2)).sum();	//곱한 값 끼리 더함.
		System.out.println("sum: " + sum);
		
		List<Employee> employees = Employee.persons();
		employees.stream().flatMapToDouble((Employee t) -> DoubleStream.of(t.getIncome()))
		.forEach(s -> System.out.println(s));
	}
}
