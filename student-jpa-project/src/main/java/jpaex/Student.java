package jpaex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries(value= {
		@NamedQuery(name="findAllStudents", query="select std from Student std"),
		@NamedQuery(name="findByRegno",query="select std from Student std where std.regNo>?1"),
		@NamedQuery(
			    name = "findRegNoAndName",
			    query = "select std.regNo, std.stdName from Student std"
			)
})

public class Student {
	@Id
   private int regNo;
	@Column(length=50)
   private String stdName;
	@Column
   private double avg;

   public Student() {
		
	}
   public Student(int regNo, String stdName, double avg) {
		super();
		this.regNo = regNo;
		this.stdName = stdName;
		this.avg = avg;
	}
   public int getRegNo() {
	return regNo;
   }
   public void setRegNo(int regNo) {
	this.regNo = regNo;
   }
   public String getStdName() {
	return stdName;
   }
   public void setStdName(String stdName) {
	this.stdName = stdName;
   }
   public double getAvg() {
	return avg;
   }
   public void setAvg(double avg) {
	this.avg = avg;
   }
   @Override
public String toString() {
	return "Student [regNo=" + regNo + ", stdName=" + stdName + ", avg=" + avg + "]";
}
}
