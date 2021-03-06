package persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipement
 *
 */
@Entity

public class Equipement implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="equipement")
	private List<BookingDetails> bookingDetails;
	private static final long serialVersionUID = 1L;

	public Equipement() {
		super();
	}   
	
	public Equipement(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<BookingDetails> getBookinkDetails() {
		return bookingDetails;
	}
	public void setBookinkDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
   
}
