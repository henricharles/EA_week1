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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Resource()
	{
		
	}
}
