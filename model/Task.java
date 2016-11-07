package model;

import org.hibernate.annotations.ManyToAny;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Task {
	@Id @GeneratedValue
	private int taskid;
	@OneToMany(mappedBy="resource")
	@ManyToOne
	@JoinColumn(name="adminid")
	private Admin admin;
	@OneToMany(mappedBy="task")
	private List<Resource> resources=new ArrayList<Resource>();
	@OneToOne
	Volunteer volunteer;
	public Task()
	{
		
	}

}
