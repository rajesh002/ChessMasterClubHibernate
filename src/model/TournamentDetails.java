package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tournament")

public class TournamentDetails {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "tournament_id_seq")
	@SequenceGenerator(name="tournament_id_seq", sequenceName="tournament_id_seq",allocationSize=1,initialValue=1) 
	int id;
	String name;
	LocalDate start_date;
	LocalDate end_date;
	public TournamentDetails(String name, LocalDate startDate, LocalDate endDate) {
		super();
		this.name = name;
		this.start_date = startDate;
		this.end_date = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartDate() {
		return start_date;
	}
	public void setStartDate(LocalDate startDate) {
		this.start_date = startDate;
	}
	public LocalDate getEndDate() {
		return end_date;
	}
	public void setEndDate(LocalDate endDate) {
		this.end_date = endDate;
	}
}
