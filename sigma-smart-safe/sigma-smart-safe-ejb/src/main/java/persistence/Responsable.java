package persistence;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Responsable
 *
 */
@Entity

public class Responsable extends User implements Serializable {

	private String sector;
	private static final long serialVersionUID = 1L;

	public Responsable() {
		super();
	}

	public Responsable(String name, String sector, String login, String password) {
		super(name, login, password);
		this.sector = sector;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}
