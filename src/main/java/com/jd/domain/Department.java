package com.jd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private long departmentId;

	@Column(name = "dept_name")
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name="stu_id", nullable=false)
	private Student student;
	
	public Department() {
	}
	
	
	public Department(Integer departmentId, String departmentName, Student student) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.student = student;
	}


	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}

	
}
