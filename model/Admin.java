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
	
	

}
