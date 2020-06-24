package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = {1, 2, 3, 4, 5};
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n>= 5).average();
		double	result;
		
		//방법1
		od.ifPresent(new DoubleConsumer() { //결과가 있으면 불러오고 없으면 아예 불러오지않음.
			
			@Override
			public void accept(double value) {
				System.out.println("결과는: " + value);	
			}
		});	
		
		//방법2
//		result = od.orElse(0.0);	//위 조건에 맞는 값이 없을경우 0.0으로 지정하겠다.
//		System.out.println(result);
		
		//방법3
//		if(od.isPresent()) {		//맞는 값이 없을 경우
//		result = od.getAsDouble();
//		System.out.println(result);
//		} else
//			System.out.println("값이 없습니다.");
		}
}
