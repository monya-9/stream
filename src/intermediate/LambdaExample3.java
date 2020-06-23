package intermediate;

import java.util.function.UnaryOperator;

public class LambdaExample3 {
	public static void main(String[] args) {
		
		UnaryOperator<String> uo = new UnaryOperator<String>() {

			@Override
			public String apply(String t) {
				return t.substring(t.length() - 3);	//끝에 숫자만큼 글자만 보여주기
//				return t.toLowerCase();	//소문자만 보여주기  ,ㅡㅡㅜㅜㅠ 왜안됨.
			}
		};
		System.out.println("Helloworld");
	}
}
