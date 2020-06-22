package Basic;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(11, 20); //range 11(start) 는 포함인데 20(end)는 포함하지 않음 rangeClosed는 둘다포함
		IntPredicate predicate = new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value % 2 == 1;
			}

		};
//		stream.filter(predicate).forEach(s -> System.out.println(s));	
		
		Random random = new Random();
		IntStream intStream = random.ints(20, 11, 100);	//젤 앞부터 10개 11부터 100까지 중에
		intStream.filter(v -> v >50 && v < 60).forEach(s -> System.out.println(s));	//50~59 50대에 숫자중 랜덤으로 숫자 및 갯수 뽑기 20개 (위 갯수) 까지
	}
}
