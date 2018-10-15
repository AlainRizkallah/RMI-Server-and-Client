import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PromotionInterface extends Remote{
	
	public void add_student(String name, int age, int id) throws RemoteException;
	public Student get_student(int id) throws RemoteException;
	public String promotion_score() throws RemoteException;

}
