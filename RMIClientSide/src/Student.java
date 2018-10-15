import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable{
	
	private String name;
	private int age;
	private int id;
	private List<Exam> scores;
	
		public Student(String name, int age, int id) {
			this.name=name;
			this.age=age;
			this.id=id;
			this.scores=new ArrayList<Exam>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<Exam> getScores() {
			return scores;
		}

		public void setScores(List<Exam> scores) {
			this.scores = scores;
		}
		
		

		
	
	

}
