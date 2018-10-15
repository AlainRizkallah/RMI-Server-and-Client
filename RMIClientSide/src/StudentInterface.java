import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentInterface extends Remote{

	
	public void add_exam(Student S, double exam, double coef, int id) throws RemoteException;
	public String print_exam(Student S) throws RemoteException;
	public double calculate_average(Student S) throws RemoteException;
	

}
