package model;

import javax.persistence.*;

@Entity
public class Volunteer extends User{
	@ManyToOne
	@JoinColumn(name="projid")
	Project vproject;
	@OneToOne
	private Task task;
public Volunteer()
{
	
	
}
}
