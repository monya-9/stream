package intermediate;

public class Student implements Comparable<Student>{	//순서가 들어가야 하는 것들은 이게 들어가야함 imp~부터 쭉
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		boolean stdBool = this.name.equals(std.name);	//name과 score가 같으면 같은 객체로 봄
		boolean scoreBool = this.score == std.score;
		return stdBool && scoreBool;
	}



	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}



	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}



	@Override
	public int compareTo(Student o) {	//순서가 정해져야 하는 것들은 이게 들어가야함
		// -(음수) 오름차순 
		// +(양수) 내림차순
		//0
//		return this.score - o.score; 	//비교 당하는 객체, 매개값은 비교 할 대상, 마이너스가 있어서 오름차순으로 한다는것, 점수 기준
		return this.name.compareTo(o.name);	//가 나 다 순
	}
	
}
