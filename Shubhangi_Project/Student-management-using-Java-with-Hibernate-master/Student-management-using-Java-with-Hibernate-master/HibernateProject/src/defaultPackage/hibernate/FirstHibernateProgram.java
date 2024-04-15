package defaultPackage.hibernate;

import java.util.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstHibernateProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SessionFactory factory=null;
		try
		{
//			Create Session Factory Object
			factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Students.class)
					.buildSessionFactory();
			
//			Insert Data
			System.out.println("Enter the values for First name, Middle Name and Last nameL:");
			Students s1=new Students(scan.next(),scan.next(),scan.next());
			new InsertIntoStudents(factory,s1);

//			Retrieve Whole Table
			System.out.println("Following is the whole data of the Studnets:");
			new RetriveWholeTable(factory);
			
//			Retrieve single row
			System.out.println("Enter the Id of student for which you want to retrive data");
			new RetriveSingleRow(factory,scan.nextInt());

//			Delete data form table using id
			System.out.println("Enter the Id of student for which you want to Delete data");
			new DeleteStudentData(factory,scan.nextInt());
		
//			Delete Data from table using field name and its value
			System.out.println("Enter the fieldname and its value of student for which you want to Delete data");
			new DeleteStudentData(factory,scan.next(),scan.next());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			factory.close();
			scan.close();
		}
	}
}
