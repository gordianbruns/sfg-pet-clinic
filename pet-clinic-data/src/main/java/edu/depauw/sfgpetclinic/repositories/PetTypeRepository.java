package edu.depauw.sfgpetclinic.repositories;

import edu.depauw.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
