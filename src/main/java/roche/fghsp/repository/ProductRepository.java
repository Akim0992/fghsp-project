package roche.fghsp.repository;

import org.springframework.data.repository.CrudRepository;

import roche.fghsp.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{
	
	public Product findById(String id);
	

}
