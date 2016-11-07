package model;

import javax.persistence.*;

import org.hibernate.type.ListType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Project {
	@Id @GeneratedValue 
	int projid;
	@Temporal(TemporalType.DATE)
	Date start;
	@Temporal(TemporalType.DATE)
	Date end;
	@Enumerated(EnumType.STRING)
	private statusType type;
	@Lob
	private byte[] description;
	
	@OneToMany(mappedBy="project")
	private List<Resource> ressources;
	@ManyToOne
	@JoinColumn(name="adminId")
	Admin admin;
	@OneToMany(mappedBy="project")
	private List<Beneficiare> beneficiares=new ArrayList<Beneficiare>();
	
	@OneToMany(mappedBy="vproject")
	private List<Volunteer> Volunteers=new ArrayList<Volunteer>();
	
	

}
