package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Admin extends User{
	@OneToMany(mappedBy="admin")
	private List<Task> taskes=new ArrayList<Task>();
	@OneToMany(mappedBy="admin")
	private List<Project> projects=new ArrayList<Project>();
	public List<Task> getTaskes() {
		return taskes;
	}
	public void setTaskes(List<Task> taskes) {
		this.taskes = taskes;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

}
