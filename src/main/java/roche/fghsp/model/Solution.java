package roche.fghsp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="solution") 
public class Solution implements Serializable{
	
	@Id
	private String id;
	
	private String hpsm_id;
	
	@NotNull
	private String name;
	
	private String description;
	
	@NotNull
	private String picture;

	private String servicenow_id;
	
	private String hpsm_name;
	
	private String hpsm_type;
	
	private String hpsm_status;
	
	private String hpsm_assigned_group;
	
	private String business_capabilities;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "is_owner_solution",
            joinColumns = @JoinColumn(name = "solution_id"),
            inverseJoinColumns = @JoinColumn(name = "owner_id")
    )// referencedColumnName = "id" not needed here
    private Set<Contact> owners = new HashSet<Contact>();
    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "is_deputy_solution",
            joinColumns = @JoinColumn(name = "solution_id"),
            inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private Set<Contact> deputies = new HashSet<Contact>();
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "is_bo_solution",
            joinColumns = @JoinColumn(name = "solution_id"),
            inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private Set<Contact> bos = new HashSet<Contact>();
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHpsm_id() {
		return hpsm_id;
	}

	public void setHpsm_id(String hpsm_id) {
		this.hpsm_id = hpsm_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getServicenow_id() {
		return servicenow_id;
	}

	public void setServicenow_id(String servicenow_id) {
		this.servicenow_id = servicenow_id;
	}

	public String getHpsm_name() {
		return hpsm_name;
	}

	public void setHpsm_name(String hpsm_name) {
		this.hpsm_name = hpsm_name;
	}

	public String getHpsm_type() {
		return hpsm_type;
	}

	public void setHpsm_type(String hpsm_type) {
		this.hpsm_type = hpsm_type;
	}

	public String getHpsm_status() {
		return hpsm_status;
	}

	public void setHpsm_status(String hpsm_status) {
		this.hpsm_status = hpsm_status;
	}

	public String getHpsm_assigned_group() {
		return hpsm_assigned_group;
	}

	public void setHpsm_assigned_group(String hpsm_assigned_group) {
		this.hpsm_assigned_group = hpsm_assigned_group;
	}

	public String getBusiness_capabilities() {
		return business_capabilities;
	}

	public void setBusiness_capabilities(String business_capabilities) {
		this.business_capabilities = business_capabilities;
	}

	public Set<Contact> getOwners() {
		return owners;
	}

	public void setOwners(Set<Contact> owners) {
		this.owners = owners;
	}

	public Set<Contact> getDeputies() {
		return deputies;
	}

	public void setDeputies(Set<Contact> deputies) {
		this.deputies = deputies;
	}

	public Set<Contact> getBos() {
		return bos;
	}

	public void setBos(Set<Contact> bos) {
		this.bos = bos;
	}	
	
}
