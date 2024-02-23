package com.spring.hibernate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity//(name="students_details")
@Table(name="students")
public class Alien {

	@Id
	private int rollNo;
	//@Transient
	private AlienName studentName;
	//@Column(name="student_mark")
	private int mark;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public AlienName getStudentName() {
		return studentName;
	}
	public void setStudentName(AlienName studentName) {
		this.studentName = studentName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Alien [rollNo=" + rollNo + ", studentName=" + studentName + ", mark=" + mark + "]";
	}
	
	
	 
}
