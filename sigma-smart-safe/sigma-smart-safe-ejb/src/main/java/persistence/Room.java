package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Room
 *
 */
@Entity

public class Room implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int number;
	private String color;

	@OneToOne
	private User patient;

	@ManyToOne
	private User supervisor;
	
	@OneToMany(mappedBy="room")
	private List<BookingDetails> bookingDetails;
	private static final long serialVersionUID = 1L;

	public Room() {
		super();
	}

	public Room(int number, String color) {
		super();
		this.number = number;
		this.color = color;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getPatient() {
		return patient;
	}

	public void setPatient(User patient) {
		this.patient = patient;
	}

	public User getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(User supervisor) {
		this.supervisor = supervisor;
	}

	public List<BookingDetails> getBookinkDetails() {
		return bookingDetails;
	}

	public void setBookinkDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

}
