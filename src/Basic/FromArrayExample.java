package Basic;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAry = {"Hong", "Hwang", "Park"};
		Stream<String> stream =  Arrays.stream(strAry);
		stream.peek(new Consumer<String>() {	//중간 처리 메소드

			@Override
			public void accept(String t) {
				System.out.println("peek: " + t.toString());
			}
		}).forEach(new Consumer<String>() {	//최종 처리 메소드 중간 처리 한번, 최종처리한번 쌍으로 세번 실행

			@Override
			public void accept(String t) {
				System.out.println("forEach : " + t.toString());
			}
		});
	}
}
