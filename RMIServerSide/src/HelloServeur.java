import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;
import java.util.List;

public class HelloServeur extends UnicastRemoteObject implements HelloInterface 
{
	private String msg;
	public HelloServeur(String msg) throws java.rmi.RemoteException
	{
		super(); this.msg = msg;
	}

	public String say() throws java.rmi.RemoteException
	{
		System.out.println("Hello world: " + msg);
		return "Hello world: " + msg;
	}
	
	
	public static void main(String args[])
	{
		try 
		{
      // new instance HelloServeur
			HelloServeur obj = new HelloServeur("I'm the HelloServeur");
			PromotionImpl prom= new PromotionImpl();
			StudentImpl stud= new StudentImpl();
			
			
			// start RMIRegistry: port 12345
			// Alternative: start rmiregistry in terminal !
			java.rmi.registry.LocateRegistry.createRegistry(12345);
			
			// register the object
			Naming.rebind("rmi://localhost:12345/mon_serveur_hello",obj);
			Naming.rebind("rmi://localhost:12345/mon_serveur_prom",prom);
			Naming.rebind("rmi://localhost:12345/mon_serveur_stud",stud);
			
			System.out.println("HelloServer bound in registry");
		} 
		catch(Exception e)
		{
      e.printStackTrace();
    }
	}
}
