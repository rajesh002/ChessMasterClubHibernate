package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="players")


public class PlayerDetails {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator= "player_id_seq")
	@SequenceGenerator(name="player_id_seq", sequenceName="player_id_seq",allocationSize=1,initialValue=1) 
	int id;
	
	int age;
	
	String name;
	
	String place;
	
	int tournamentId;
	public PlayerDetails() {
		
	}
	public PlayerDetails(String name, String place, int age, int tournamentId) {
		super();
		this.name = name;
		this.place=place;
		this.age = age;
		this.tournamentId = tournamentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	
}
