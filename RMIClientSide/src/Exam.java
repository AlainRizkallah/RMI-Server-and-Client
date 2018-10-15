import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Exam implements Serializable{
	

	private int id;
	private double value;
	private double coef;
	
		public Exam(int id, double value, double coef) {
			this.value=value;
			this.coef=coef;
			this.id=id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public double getCoef() {
			return coef;
		}

		public void setCoef(double coef) {
			this.coef = coef;
		}
		

}
