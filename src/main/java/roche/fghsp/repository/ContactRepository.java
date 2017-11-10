package roche.fghsp.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import roche.fghsp.model.Contact;
import roche.fghsp.model.Solution;

public interface ContactRepository extends CrudRepository<Contact, String>{
	
//	@Query ("Select solution.id as solid, solution.name as solname, solution.hpsm_name,  from solution, contact, is_owner_solution where contact.id = ?1 AND contact.id = is_owner_solution.owner_id AND solution.id = is_owner_solution.solution_id")
//	Set<Contact> findBySolution_Owner(String solution_id);	
//	public Set<Contact> findBySolution_Deputy(Solution solution);
//	public Set<Contact> findBySolution_BO(Solution solution);
	

}
