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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

}
