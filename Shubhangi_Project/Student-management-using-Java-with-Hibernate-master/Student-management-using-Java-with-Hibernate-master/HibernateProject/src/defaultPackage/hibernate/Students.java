package defaultPackage.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//map class with the Database Table
@Table(name="students")
public class Students {
	
	//Map Fields with the Database table Column
	@Id
	//for Auto Increment primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int Id;
	
	//Map with table column
	@Column(name="FNAME")
	private String Fname;
	
	//Map with table column
	@Column(name="MNAME")
	private String Mname;
	
	//Map with table column
	@Column(name="LNAME")
	private String Lname;
	
	//Default Constructor
	public Students()
	{
		
	}
	
	//Parameterized constructor
	public Students(String fname, String mname, String lname) 
	{
		Fname = fname;
		Mname = mname;
		Lname = lname;
	}
	//Getter and Setter for giver fields of the Class which automatically called
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	
	//Overwrite the Object Class Method to display object value in pretty way
	@Override
	public String toString() {
		return "ID=" + Id + ", First Name=" + Fname + ", Middle Name=" + Mname + ", Last name=" + Lname +"\n" ;
	}

}
