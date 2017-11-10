package roche.fghsp.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import roche.fghsp.model.Solution;

public interface SolutionRepository extends CrudRepository<Solution, String>{
	
//	@Query("Select solution.id as sol_id, solution.name as sol_name, solution.hpsm_name as sol_hpsm_name, solution.picture as sol_picture, contact.id as cont_id, contact.name as cont_name, contact.surname as cont_surname from solution, contact, is_owner_solution where contact.id = is_owner_solution.owner_id AND solution.id = is_owner_solution.solution_id")
//	@Query(value = "Select solution.id as sol_id, solution.name as sol_name, solution.hpsm_name as sol_hpsm_name, solution.picture as sol_picture, contact.id as cont_id, contact.name as cont_name, contact.surname as cont_surname from solution, contact, is_owner_solution where contact.id = is_owner_solution.owner_id AND solution.id = is_owner_solution.solution_id", nativeQuery = true)
//	
//	@Query("Select s, c from Solution s, Contact c join s.owners o join c.solutions so")  //@manytomany query
//	@Query("Select s from Solution s join s.owners o")
//	Set<Object[]> findSolution();
	

}
