package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User  {
	@Id
	@GeneratedValue
	int userid;
	String name;
	@Temporal(TemporalType.DATE)
	Date dob;
	String qualification;
	public User()
	{
		
	}

}
