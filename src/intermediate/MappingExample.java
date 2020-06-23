package intermediate;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {
	public static void main(String[] args) {
		Stream.of(1, 2, 3).flatMap((t) -> Stream.of(t, t * 2, t * t))	// 원 값과 원 값의 *2, 원 값의 제곱 (답이 살짝 이상한것같음)
		.forEach(s -> System.out.println(s));
		
		Stream.of(1, 2, 3).flatMapToInt(new Function<Integer, IntStream>() {

			@Override
			public IntStream apply(Integer t) {
				return IntStream.of(t * 2);
			}
		});
		
		Employee.persons().stream().flatMapToDouble(new Function<Employee, DoubleStream>() {	//Employee class에 있는 income만 가져옴

			@Override
			public DoubleStream apply(Employee t) {
				return DoubleStream.of(t.getIncome());
			}
		}).forEach(s -> System.out.println(s));
	}
}
