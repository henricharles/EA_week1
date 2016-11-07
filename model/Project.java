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
	private List<Volunteer> Volunteers;
	@OneToMany(mappedBy="hdhhd")
	List<Volunteer> volunteers =new ArrayList<Volunteer>();
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public statusType getType() {
		return type;
	}
	public void setType(statusType type) {
		this.type = type;
	}
	public byte[] getDescription() {
		return description;
	}
	public void setDescription(byte[] description) {
		this.description = description;
	}
	public List<Resource> getRessources() {
		return ressources;
	}
	public void setRessources(List<Resource> ressources) {
		this.ressources = ressources;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Beneficiare> getBeneficiares() {
		return beneficiares;
	}
	public void setBeneficiares(List<Beneficiare> beneficiares) {
		this.beneficiares = beneficiares;
	}
	public List<Volunteer> getVolunteers() {
		return Volunteers;
	}
	public void setVolunteers(List<Volunteer> volunteers) {
		Volunteers = volunteers;
	}
	
	
	
	

}
