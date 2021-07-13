package com.example.StudentOauth.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int student_id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private long mobile_no;
	
	@Column
	private String email;
	
	@Column
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="student_id")
	private Set<Project> projects = null;
	 	
	@Column
	private String photo_upload;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public String getPhoto_upload() {
		return photo_upload;
	}

	public void setPhoto_upload(String photo_upload) {
		this.photo_upload = photo_upload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [student_id=");
		builder.append(student_id);
		builder.append(", first_name=");
		builder.append(first_name);
		builder.append(", last_name=");
		builder.append(last_name);
		builder.append(", mobile_no=");
		builder.append(mobile_no);
		builder.append(", email=");
		builder.append(email);
		builder.append(", projects=");
		builder.append(projects);
		builder.append(", photo_upload=");
		builder.append(photo_upload);
		builder.append("]");
		return builder.toString();
	}

}
