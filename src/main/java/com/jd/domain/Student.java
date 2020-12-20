package com.jd.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "stu_id")
	private long studentId;

	@Column(name = "stu_name")
	private String studentName;

	@OneToMany(mappedBy = "student", cascade=CascadeType.ALL)
	private Set<Department> dept;
	
	public Student() {
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Department> getDept() {
		return dept;
	}

	public void setDept(Set<Department> dept) {
		this.dept = dept;
	}
}