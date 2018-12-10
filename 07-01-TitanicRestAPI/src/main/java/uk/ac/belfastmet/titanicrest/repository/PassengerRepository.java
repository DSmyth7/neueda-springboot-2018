package uk.ac.belfastmet.titanicrest.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicrest.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

	Passenger findByPassengerId(Integer passengerId);

	

}
