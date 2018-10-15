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
		Exam ex = new Exam(id, exam, coef);
		S.getScores().add(ex);

	}

	public String print_exam(Student S) throws RemoteException {
		String out="";
		for(Exam i:S.getScores()) {
			out=out+" "+i.getValue();
		}
		System.out.println(S.getScores());
		return(out);
	}

	public double calculate_average(Student S) throws RemoteException {
		return 0;
//		List<Double> co = S.getCoefs();
//		List<Double> sco= S.getScores();
//		double M=0;
//		double C=0;
//		for(int i=0;i<sco.size();i++) {
//			M=M+sco.get(i)*co.get(i);
//			C=C+co.get(i);
//		}
//		double av= M/C;
//		return av;
	}

}
