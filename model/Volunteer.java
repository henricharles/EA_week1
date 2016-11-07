package model;

import javax.persistence.*;

@Entity
public class Volunteer extends User{
	@ManyToOne
	@JoinColumn(name="projid")
	Project vproject;
	@OneToOne
	private Task task;
	public Project getVproject() {
		return vproject;
	}
	public void setVproject(Project vproject) {
		this.vproject = vproject;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@ManyToOne
	@JoinColumn(name="project")
	Project project;
public Volunteer()
{
	
	
}
}
