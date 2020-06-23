package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = {1, 2, 3, 4, 5};
		double[] doubleAry = {1.1, 2.3, 3.5, 4.2, 5.5};
		
		IntStream intStream = Arrays.stream(intAry);
		DoubleStream doubleStream =  Arrays.stream(doubleAry);
		
		doubleStream = intStream.asDoubleStream();	//intStream 을 doubleStream으로 바꿈
		doubleStream.forEach(s -> System.out.println(s));
		
		intStream = Arrays.stream(intAry);	//원래 형식으로 바꿈
		intStream.asLongStream().forEach(System.out::println);
		
		intStream = Arrays.stream(intAry);	//intStream 을 Integer로 바꿈.
		Stream<Integer> iStream = intStream.boxed();
		iStream.forEach(s -> System.out.println(s));
		
		
	}
}
