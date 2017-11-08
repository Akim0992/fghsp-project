package roche.fghsp.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import roche.fghsp.model.Contact;
import roche.fghsp.model.Solution;

public interface ContactRepository extends CrudRepository<Contact, String>{
	
	public Set<Contact> findBySolution_Owner(Solution solution);
	public Set<Contact> findBySolution_Deputy(Solution solution);
	public Set<Contact> findBySolution_BO(Solution solution);
}
