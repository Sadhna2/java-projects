package jpaex.onetoone;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
	@Id
	private String passportNumber;
	@Column
	private LocalDate dateIssued;
	@Column
	private LocalDate dateExpiry;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="personId",unique=true)
	private Person person;
	

	public Passport() {
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public LocalDate getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(LocalDate dateIssued) {
		this.dateIssued = dateIssued;
	}

	public LocalDate getDateExpiry() {
		return dateExpiry;
	}

	public void setDateExpiry(LocalDate dateExpiry) {
		this.dateExpiry = dateExpiry;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", dateIssued=" + dateIssued + ", dateExpiry="
				+ dateExpiry + ", person=" + person + "]";
	}
	
	

}
