package roche.fghsp.model;

import javax.persistence.Id;

public class Contact {
	@Id
	private String id;
	
	private String name;
	
	private String surname;
	
	private String email;

	private String site_location;
	
	private String country;
	
	private String department;
	
	private String roche_id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the site_location
	 */
	public String getSite_location() {
		return site_location;
	}

	/**
	 * @param site_location the site_location to set
	 */
	public void setSite_location(String site_location) {
		this.site_location = site_location;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the roche_id
	 */
	public String getRoche_id() {
		return roche_id;
	}

	/**
	 * @param roche_id the roche_id to set
	 */
	public void setRoche_id(String roche_id) {
		this.roche_id = roche_id;
	}
}
