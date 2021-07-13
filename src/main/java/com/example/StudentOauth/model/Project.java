package com.example.StudentOauth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int project_id;
	
	@Column
	private String project_name;
	
	@Column
	private String duration;
	
	@Column
	private int student_id;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [project_id=");
		builder.append(project_id);
		builder.append(", project_name=");
		builder.append(project_name);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", student_id=");
		builder.append(student_id);
		builder.append("]");
		return builder.toString();
	} 
	
}
