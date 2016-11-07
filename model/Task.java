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
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	public Volunteer getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}
	@OneToMany(mappedBy="task")
	private List<Resource> resources=new ArrayList<Resource>();
	@OneToOne
	Volunteer volunteer;
	public Task()
	{
		
	}

}
