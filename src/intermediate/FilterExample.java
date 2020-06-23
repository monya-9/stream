package intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream().filter((Employee t) -> t.getIncome() > 3000)
			.filter((t) -> t.isFemale())
			.peek(System.out::println) //반영 전 값을 보고시플때 위 부분만 나옴
			.forEach(s -> s.setIncome(s.getIncome() * 1.1));	//위 해당하는 조건에 맞는 사람만 *1.1됨 나오는건 전체다나옴
		employees.stream().forEach(System.out::println) ;
	}
}
