package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
public class Resource {
	@Id @GeneratedValue
	int id;
	@ManyToOne
	@JoinColumn(name="projectId")
	private Project project;
	@ManyToOne
	@JoinColumn(name ="taskid")
	Task task;
	public Resource()
	{
		
	}
}
