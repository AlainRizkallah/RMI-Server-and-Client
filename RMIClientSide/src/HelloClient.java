import java.rmi.*;
import java.util.ArrayList;

public class HelloClient {
	public static void main(String args[]) 
	{
		try 
		{
      // lookup for the object
			HelloInterface obj = (HelloInterface)	Naming.lookup("rmi://localhost:12345/mon_serveur_hello");
			PromotionInterface prom = (PromotionInterface) Naming.lookup("rmi://localhost:12345/mon_serveur_prom");
			StudentInterface stud = (StudentInterface) Naming.lookup("rmi://localhost:12345/mon_serveur_stud");
			
			// call methods
			String msg = obj.say();
			System.out.println(msg);
			
			prom.add_student("alain", 22, 1);
			prom.add_student("mamadou", 28, 2);
			Student alain=prom.get_student(1);
			Student mamadou=prom.get_student(2);
			
		
			System.out.println("nom de l'eleve 1: "+alain.getName());
			System.out.println("age de mamadou: "+mamadou.getAge());
			
			stud.add_exam(mamadou, 20.0, 2.0 ,1);
			stud.add_exam(mamadou, 15.0, 2.0 ,2);
			stud.add_exam(mamadou, 18, 1 , 3);
			stud.add_exam(mamadou, 13, 1, 4);
			
			System.out.println("les notes: "+stud.print_exam(mamadou));
			
//			System.out.println("average: "+stud.calculate_average(mamadou));

			
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
