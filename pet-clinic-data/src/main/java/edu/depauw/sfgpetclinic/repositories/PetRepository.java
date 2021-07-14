package edu.depauw.sfgpetclinic.repositories;

import edu.depauw.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
