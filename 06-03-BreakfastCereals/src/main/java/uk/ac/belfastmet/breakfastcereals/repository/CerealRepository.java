package uk.ac.belfastmet.breakfastcereals.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;


public interface CerealRepository extends CrudRepository<Cereal,Integer>{
	
	Cereal findByCerealId(Integer cerealId);



	Iterable<Cereal> findByCerealContaining(String cereal);

}
