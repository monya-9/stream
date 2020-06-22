package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		for(int n : numbers) {	// 1, 3 ,5 홀수 제곱값 구하기
			if (n % 2 == 1) {
				int square = n * n;
				sum += square;
			}
		}
		//stream 형식으로 변경
//		System.out.println("결과: " + sum);
//		Predicate<Integer> predicate = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t%2==1;	//t로 나눈 2가 1인지 여부 (t를 2로 나눈 값이 1인 값만 return 해주세요)
//			}
//			
//		};
		System.out.println("결과: " + sum);
//		Predicate<Integer> predicate = (t) -> t%2==1; //t로 나눈 2가 1인지 여부 (t를 2로 나눈 값이 1인 값만 return 해주세요) 람다식.
//		Function<Integer, Integer> function = new Function<Integer, Integer> (){	//람다전
//
//			@Override
//			public Integer apply(Integer t) {
//				return t * t;
//			}
//			
//		};
		
		numbers.stream().filter((t) -> t % 2 == 1)	//람다후
			.map(t -> t * t)
			.forEach(s -> sum += s);
		System.out.println("결과: " +  sum);
//		numbers.stream().filter(predicate).forEach(s -> System.out.println(s)); 위 return 값 (홀수숫자만) print
	}
}
