package roche.fghsp.model;

import java.io.Serializable;
import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="product") 
public class Product implements Serializable{
	

	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@NotNull
	@Size(min=2, max=30)
	private String name;
	private String description;
	private BigDecimal price;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		
		
		
		this.id = id;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
