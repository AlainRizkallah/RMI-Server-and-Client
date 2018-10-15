import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl extends UnicastRemoteObject implements StudentInterface {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected StudentImpl() throws RemoteException {
		super();
	}
	
	public void add_exam(Student S, double exam, double coef, int id) throws RemoteException {
//		ArrayList<Double> co = S.getCoefs();
//		ArrayList<Double> sco= S.getScores();
//		co.add(coef);
//		sco.add(exam);
//		S.setCoefs(co);
//		System.out.println("exams: ");
//		System.out.println(sco);
//		S.setScores(sco);
		int i=S.getId();
		Exam ex = new Exam(id, exam, coef);
		for (Student s:PromotionImpl.Promo)
			if(s.getId()==i)
				s.getScores().add(ex);
	}

	public String print_exam(Student S) throws RemoteException {
		int id=S.getId();
		String out="";
		for(Student student:PromotionImpl.Promo)
		if(student.getId()==id)
		for(Exam i:student.getScores()) {
			out=out+" "+i.getValue();
		}
		return(out);
	}

	public double calculate_average(Student S) throws RemoteException {
		int id=S.getId();
		double M=0;
		double C=0;
		for(Student s: PromotionImpl.Promo)
			if(s.getId()==id) {
				for (Exam e: s.getScores()) {
					M=M+(e.getValue())*e.getCoef();
					C=C+e.getCoef();}
			}
		double av= M/C;
		return av;
	}

}
