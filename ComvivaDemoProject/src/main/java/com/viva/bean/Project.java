package com.viva.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proj_tab")
public class Project {
	@Id
	@GeneratedValue
	@Column(name="pid")
	private int projId;

	@Column(name="pname")
	private String projName;
	
	@Column(name="pstatus")
	private String projStatus;
	
	public String getProjStatus() {
		return projStatus;
	}

	public void setProjStatus(String projStatus) {
		this.projStatus = projStatus;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}


	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", projStatus=" + projStatus + "]";
	}
	
	
	
	

}
