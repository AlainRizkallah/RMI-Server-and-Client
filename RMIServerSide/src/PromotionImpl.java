import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PromotionImpl extends UnicastRemoteObject implements PromotionInterface{
	public static ArrayList<Student> Promo =new ArrayList<>();
	
	protected PromotionImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void add_student(String name, int age, int id) throws RemoteException {
		Student student=new Student(name, age,id);
		this.Promo.add(student);
			
	}

	
	public Student get_student(int id) throws RemoteException {
		for(int i=0 ; i<this.Promo.size();i++)
			if(this.Promo.get(i).getId()==id) {
				System.out.println(this.Promo.get(i).getName());
				return this.Promo.get(i);
			}
		return null;
		
	}

	
	public String promotion_score() throws RemoteException {
		double N=0;
		double D=0;
		for(Student student: Promo) {
			for(Exam exam: student.getScores()) {
				N=N+exam.getValue()*exam.getCoef();
				D=D+exam.getCoef();
				}		
		}
			double d= N/D;
		
		return String.valueOf(d);
		// TODO Auto-generated method stub
		
	}
	
		

}
