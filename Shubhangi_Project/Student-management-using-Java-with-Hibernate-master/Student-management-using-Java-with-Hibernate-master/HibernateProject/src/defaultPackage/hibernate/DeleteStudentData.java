package defaultPackage.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteStudentData {
	
	//Constructor for delete using id
	public DeleteStudentData(SessionFactory factory,int x)
	{
		
		// create session
		Session session = factory.getCurrentSession();
		
		//begin Transaction
		session.beginTransaction();
		
		//execute query
		session.createQuery("delete from Students where Id="+x).executeUpdate();
		
		// commit the transaction
		session.getTransaction().commit();
		
		//Display Successful Message
		System.out.println("Data successful deleted");
		
	}
	
	//Constructor for delete using field name and its value
	public DeleteStudentData(SessionFactory factory,String fieldNm,String value)
	{
		// create session
		Session session = factory.getCurrentSession();
		
		//begin Transaction
		session.beginTransaction();
		
		//execute query
		session.createQuery("delete from Students where "+fieldNm+"='"+value+"'").executeUpdate();
		
		// commit the transaction
		session.getTransaction().commit();
		
		//Display Successful Message
		System.out.println("Data successful deleted");
	}
}
