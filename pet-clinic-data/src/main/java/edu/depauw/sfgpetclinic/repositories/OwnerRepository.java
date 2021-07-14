package edu.depauw.sfgpetclinic.repositories;

import edu.depauw.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
