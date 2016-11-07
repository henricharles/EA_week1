package model;

import javax.persistence.JoinColumn;
import javax.persistence.*;
@Entity
public class Beneficiare extends User{
	public Beneficiare()
	{
		
	}
	@ManyToOne
	@JoinColumn(name="project")
	Project project;

}
