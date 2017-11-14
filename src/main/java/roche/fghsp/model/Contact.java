package roche.fghsp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="contact") 
public class Contact implements Serializable {
	@Id
	private String id;
	
	private String name;
	
	private String surname;
	
	private String email;

	private String site_location;
	
	private String country;
	
	private String department;
	
	private String photo;
	
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "owners")
    private Set<Solution> isOwnerSolutions = new HashSet<Solution>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "deputies")
    private Set<Solution> isDeputySolutions = new HashSet<Solution>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "bos")
    private Set<Solution> isBoSolutions = new HashSet<Solution>();
    
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "owners")
    private Set<Component> isOwnerComponents = new HashSet<Component>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "deputies")
    private Set<Component> isDeputyComponents = new HashSet<Component>();
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "bos")
    private Set<Component> isBoComponents = new HashSet<Component>();
    

	@NotNull
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
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<Solution> getIsOwnerSolutions() {
		return isOwnerSolutions;
	}

	public void setIsOwnerSolutions(Set<Solution> isOwnerSolutions) {
		this.isOwnerSolutions = isOwnerSolutions;
	}

	public Set<Solution> getIsDeputySolutions() {
		return isDeputySolutions;
	}

	public void setIsDeputySolutions(Set<Solution> isDeputySolutions) {
		this.isDeputySolutions = isDeputySolutions;
	}

	public Set<Solution> getIsBoSolutions() {
		return isBoSolutions;
	}

	public void setIsBoSolutions(Set<Solution> isBoSolutions) {
		this.isBoSolutions = isBoSolutions;
	}

	public Set<Component> getIsOwnerComponents() {
		return isOwnerComponents;
	}

	public void setIsOwnerComponents(Set<Component> isOwnerComponents) {
		this.isOwnerComponents = isOwnerComponents;
	}

	public Set<Component> getIsDeputyComponents() {
		return isDeputyComponents;
	}

	public void setIsDeputyComponents(Set<Component> isDeputyComponents) {
		this.isDeputyComponents = isDeputyComponents;
	}

	public Set<Component> getIsBoComponents() {
		return isBoComponents;
	}

	public void setIsBoComponents(Set<Component> isBoComponents) {
		this.isBoComponents = isBoComponents;
	}



	
	
}
